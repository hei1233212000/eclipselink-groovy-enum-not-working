## This is a project to show the problem when using Yasson with Groovy

### Execute the test by
>./gradlew test --info

You will see the GroovyUserSpecification will be failed because of
>Caused by:
 Exception [EclipseLink-3002] (Eclipse Persistence Services - 2.6.5.v20170607-b3d05bd): org.eclipse.persistence.exceptions.ConversionException  
 Exception Description: The object [Male], of class [class java.lang.String], from mapping [org.eclipse.persistence.mappings.DirectToFieldMapping[sex-->GROOVY_USER.SEX]] with descriptor [RelationalDescriptor(com.model.entity.GroovyUser --> [DatabaseTable(GROOVY_USER)])], could not be converted to [interface groovy.lang.GroovyObject].  
     at org.eclipse.persistence.exceptions.ConversionException.couldNotBeConverted(ConversionException.java:78)  
     at org.eclipse.persistence.internal.helper.ConversionManager.convertObject(ConversionManager.java:176)  
     at org.eclipse.persistence.internal.databaseaccess.DatasourcePlatform.convertObject(DatasourcePlatform.java:179)  
     at org.eclipse.persistence.mappings.foundation.AbstractDirectMapping.getFieldValue(AbstractDirectMapping.java:789)  
     at org.eclipse.persistence.mappings.foundation.AbstractDirectMapping.writeFromObjectIntoRow(AbstractDirectMapping.java:1292)  
     at org.eclipse.persistence.internal.descriptors.ObjectBuilder.buildRow(ObjectBuilder.java:1567)  
     at org.eclipse.persistence.internal.descriptors.ObjectBuilder.buildRow(ObjectBuilder.java:1555)  
     at org.eclipse.persistence.internal.queries.DatabaseQueryMechanism.insertObjectForWrite(DatabaseQueryMechanism.java:451)  
     at org.eclipse.persistence.queries.InsertObjectQuery.executeCommit(InsertObjectQuery.java:80)  
     at org.eclipse.persistence.queries.InsertObjectQuery.executeCommitWithChangeSet(InsertObjectQuery.java:90)  
     at org.eclipse.persistence.internal.queries.DatabaseQueryMechanism.executeWriteWithChangeSet(DatabaseQueryMechanism.java:301)  
     at org.eclipse.persistence.queries.WriteObjectQuery.executeDatabaseQuery(WriteObjectQuery.java:58)  
     at org.eclipse.persistence.queries.DatabaseQuery.execute(DatabaseQuery.java:911)  
     at org.eclipse.persistence.queries.DatabaseQuery.executeInUnitOfWork(DatabaseQuery.java:810)  
     at org.eclipse.persistence.queries.ObjectLevelModifyQuery.executeInUnitOfWorkObjectLevelModifyQuery(ObjectLevelModifyQuery.java:108)  
     at org.eclipse.persistence.queries.ObjectLevelModifyQuery.executeInUnitOfWork(ObjectLevelModifyQuery.java:85)  
     at org.eclipse.persistence.internal.sessions.UnitOfWorkImpl.internalExecuteQuery(UnitOfWorkImpl.java:2899)  
     at org.eclipse.persistence.internal.sessions.AbstractSession.executeQuery(AbstractSession.java:1863)  
     at org.eclipse.persistence.internal.sessions.AbstractSession.executeQuery(AbstractSession.java:1845)  
     at org.eclipse.persistence.internal.sessions.AbstractSession.executeQuery(AbstractSession.java:1796)  
     at org.eclipse.persistence.internal.sessions.CommitManager.commitNewObjectsForClassWithChangeSet(CommitManager.java:227)  
     at org.eclipse.persistence.internal.sessions.CommitManager.commitAllObjectsWithChangeSet(CommitManager.java:126)  
     at org.eclipse.persistence.internal.sessions.AbstractSession.writeAllObjectsWithChangeSet(AbstractSession.java:4279)  
     at org.eclipse.persistence.internal.sessions.UnitOfWorkImpl.commitToDatabase(UnitOfWorkImpl.java:1444)  
     at org.eclipse.persistence.internal.sessions.UnitOfWorkImpl.commitToDatabaseWithChangeSet(UnitOfWorkImpl.java:1534)  
     at org.eclipse.persistence.internal.sessions.RepeatableWriteUnitOfWork.commitRootUnitOfWork(RepeatableWriteUnitOfWork.java:278)  
     at org.eclipse.persistence.internal.sessions.UnitOfWorkImpl.commitAndResume(UnitOfWorkImpl.java:1172)  
     at org.eclipse.persistence.internal.jpa.transaction.EntityTransactionImpl.commit(EntityTransactionImpl.java:134)  
     ... 1 more
