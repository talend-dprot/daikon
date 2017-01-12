package org.talend.daikon.kafka.mongo.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.talend.daikon.kafka.mongo.repo.model.PersistentPendingRecord;
import org.talend.daikon.repo.RecordPriority;

public interface MongoPendingRecordRepository extends MongoRepository<PersistentPendingRecord, String> {

    List<PersistentPendingRecord> findByApplicationNameAndRecordPriority(String applicationName, RecordPriority priority);
}