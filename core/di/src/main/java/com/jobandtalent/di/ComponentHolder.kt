package com.jobandtalent.di

interface ComponentHolder {
    fun <T> getComponent(): T
}