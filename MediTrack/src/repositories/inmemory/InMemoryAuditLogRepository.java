
package repositories.inmemory;

import repositories.AuditLogRepository;
import models.AuditLog;

import java.util.*;

public class InMemoryAuditLogRepository implements AuditLogRepository {
    private final Map<String, AuditLog> logs = new HashMap<>();

    @Override
    public void save(AuditLog log) {
        logs.put(log.getLogID(), log);
    }

    @Override
    public Optional<AuditLog> findById(String id) {
        return Optional.ofNullable(logs.get(id));
    }

    @Override
    public List<AuditLog> findAll() {
        return new ArrayList<>(logs.values());
    }

    @Override
    public void delete(String id) {
        logs.remove(id);
    }
}
