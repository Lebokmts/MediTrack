/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kelebogile
 */
package test;

import singletons.AuditLogger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AuditLoggerTest {
    @Test
    public void testSingletonLoggerReturnsSameInstance() {
        AuditLogger logger1 = AuditLogger.getInstance();
        AuditLogger logger2 = AuditLogger.getInstance();

        assertSame(logger1, logger2);
    }
}

