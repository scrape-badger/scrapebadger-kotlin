package com.scrapebadger.client.models

import com.squareup.moshi.Json
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class OpenModelsTest : StringSpec({
    "repository is_empty stays distinct from the additional-properties map" {
        val repository = GitHubRepositoryIdentity(
            name = "repo",
            fullName = "octocat/repo",
            link = "https://example.test/repo",
            owner = GitHubRepositoryAccount(login = "octocat"),
            repositoryEmpty = true
        )
        repository["native_extra"] = mapOf("nested" to 42)
        repository.repositoryEmpty shouldBe true
        repository.isEmpty() shouldBe false
        repository["native_extra"] shouldBe mapOf("nested" to 42)
        GitHubRepositoryIdentity::class.java.constructors
            .flatMap { it.parameterAnnotations.toList() }
            .flatMap { it.toList() }
            .filterIsInstance<Json>()
            .any { it.name == "is_empty" } shouldBe true
    }
})
