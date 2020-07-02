package com.safecharge.cardscanner

enum class SCCardScannerError {
    CANCEL, MISSING_PERMISSION, UNSUPPORTED_DEVICE, UNKNOWN;

    fun code() = when (this) {
        CANCEL -> 101
        MISSING_PERMISSION -> 102
        UNSUPPORTED_DEVICE -> 103
        UNKNOWN -> 104
    }

    fun description() = when (this) {
        CANCEL ->
            "User cancelled"
        MISSING_PERMISSION ->
            "No permission given to use camera"
        UNSUPPORTED_DEVICE ->
            "Your device does not support this functionality"
        UNKNOWN ->
            "Unknown error"
    }
}