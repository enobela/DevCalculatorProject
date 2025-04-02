/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
import com.mycompany.devcalculator.Calculator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DTest {
    
    Calculator cal = new Calculator();
    
   @Test
    public void TestAdd()
    {
        assertEquals(5,cal.Add(3, 2));
    }
}
