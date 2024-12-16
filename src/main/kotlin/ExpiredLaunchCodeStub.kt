package org.mahata

class ExpiredLaunchCodeStub: LaunchCode {
    override fun isExpired(): Boolean {
        return true
    }

    override fun isSigned(): Boolean {
        return true
    }
}
