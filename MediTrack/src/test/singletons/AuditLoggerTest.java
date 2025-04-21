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
