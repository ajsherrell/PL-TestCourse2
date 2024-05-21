package com.plcoding.testingcourse.part4.presentation

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class BadProfileViewModelTest {

    private lateinit var viewModel: BadProfileViewModel

    @BeforeEach
    fun setUp() {
        viewModel = BadProfileViewModel()
    }

    @Test
    fun `test save profile`() {
        // Given

        // When
        viewModel.saveProfile()

        // Then
        assertEquals("Successfully saved profile", viewModel.state.infoMessage)
    }
}