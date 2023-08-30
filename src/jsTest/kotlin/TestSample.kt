import kotlin.test.Ignore
import kotlin.test.Test
import kotlin.test.assertTrue

class TestSample {
    @Test
    fun test_correct() {
        println("Hello, world!")
        assertTrue { true }
    }

    @Ignore
    @Test
    fun test_incorrect() {
        println("Hello, world!")
        assertTrue { false }
    }
}
