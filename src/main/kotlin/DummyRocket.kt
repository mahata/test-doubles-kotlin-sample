package org.mahata

class DummyRocket: Rocket {
    override fun launch() {
        throw RuntimeException()
    }

    override fun disable() {}
}
