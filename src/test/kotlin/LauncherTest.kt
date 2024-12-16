import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mahata.DummyRocket
import org.mahata.ExpiredLaunchCodeStub
import org.mahata.Launcher

class LauncherTest {
    @Test
    fun sample() {
        assertTrue(true)
    }

    @Test
    fun givenExpiredLaunchCodes_RocketIsNotLaunched() {
        Launcher().launchRocket(DummyRocket(), ExpiredLaunchCodeStub())
    }
}
