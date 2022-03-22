import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MainKtTest{

    @Test
    fun `should return optimized expected result`(){
        //given
        val inputArticles = 163841689525773
        val expectedResult = "163/81/46/82/9/55/73/7"

        //when
        val result = inputArticles.main()

        //then
        assertEquals(expectedResult, result)
    }
}