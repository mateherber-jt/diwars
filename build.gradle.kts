import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.gradle.versions)
    alias(libs.plugins.android.library) apply false
}

tasks.withType<DependencyUpdatesTask>().configureEach {
    gradleReleaseChannel = "current"

    filterConfigurations = Spec { item ->
        listOf(
            "release",
            "production",
            "beta",
            "kapt",
            "detekt",
            "ktlint"
        ).none { item.name.lowercase().contains(it) }
    }

    rejectVersionIf {
        val ignored = listOf("alpha", "beta", "rc", "m1", "m2", "dev")
        !(ignored.any { it in currentVersion.lowercase() }) &&
                ignored.any { it in candidate.version.lowercase() }
    }
}

