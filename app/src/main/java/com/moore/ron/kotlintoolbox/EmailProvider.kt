package com.moore.ron.kotlintoolbox

/**
 * Created by ron on 9/30/17.
 */
interface EmailProvider {

    // this interface provides the default implementation for the nickname property and method
    // it parses out text before the "@" and checks if there is text

    val email:String
    val nickname:String
        // gets the substring of email
    get() = email.substringBefore("@")

    // checks to see if there is text in the substring
    fun validateEmail() = nickname.isNotEmpty()

    }
