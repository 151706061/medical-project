package com.medicalproj.common.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StudyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseIdIsNull() {
            addCriterion("MEDICAL_CASE_ID is null");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseIdIsNotNull() {
            addCriterion("MEDICAL_CASE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseIdEqualTo(Integer value) {
            addCriterion("MEDICAL_CASE_ID =", value, "medicalCaseId");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseIdNotEqualTo(Integer value) {
            addCriterion("MEDICAL_CASE_ID <>", value, "medicalCaseId");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseIdGreaterThan(Integer value) {
            addCriterion("MEDICAL_CASE_ID >", value, "medicalCaseId");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEDICAL_CASE_ID >=", value, "medicalCaseId");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseIdLessThan(Integer value) {
            addCriterion("MEDICAL_CASE_ID <", value, "medicalCaseId");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("MEDICAL_CASE_ID <=", value, "medicalCaseId");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseIdIn(List<Integer> values) {
            addCriterion("MEDICAL_CASE_ID in", values, "medicalCaseId");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseIdNotIn(List<Integer> values) {
            addCriterion("MEDICAL_CASE_ID not in", values, "medicalCaseId");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseIdBetween(Integer value1, Integer value2) {
            addCriterion("MEDICAL_CASE_ID between", value1, value2, "medicalCaseId");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MEDICAL_CASE_ID not between", value1, value2, "medicalCaseId");
            return (Criteria) this;
        }

        public Criteria andStudyIdIsNull() {
            addCriterion("STUDY_ID is null");
            return (Criteria) this;
        }

        public Criteria andStudyIdIsNotNull() {
            addCriterion("STUDY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStudyIdEqualTo(String value) {
            addCriterion("STUDY_ID =", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdNotEqualTo(String value) {
            addCriterion("STUDY_ID <>", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdGreaterThan(String value) {
            addCriterion("STUDY_ID >", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdGreaterThanOrEqualTo(String value) {
            addCriterion("STUDY_ID >=", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdLessThan(String value) {
            addCriterion("STUDY_ID <", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdLessThanOrEqualTo(String value) {
            addCriterion("STUDY_ID <=", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdLike(String value) {
            addCriterion("STUDY_ID like", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdNotLike(String value) {
            addCriterion("STUDY_ID not like", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdIn(List<String> values) {
            addCriterion("STUDY_ID in", values, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdNotIn(List<String> values) {
            addCriterion("STUDY_ID not in", values, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdBetween(String value1, String value2) {
            addCriterion("STUDY_ID between", value1, value2, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdNotBetween(String value1, String value2) {
            addCriterion("STUDY_ID not between", value1, value2, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyDateIsNull() {
            addCriterion("STUDY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStudyDateIsNotNull() {
            addCriterion("STUDY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStudyDateEqualTo(Date value) {
            addCriterionForJDBCDate("STUDY_DATE =", value, "studyDate");
            return (Criteria) this;
        }

        public Criteria andStudyDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("STUDY_DATE <>", value, "studyDate");
            return (Criteria) this;
        }

        public Criteria andStudyDateGreaterThan(Date value) {
            addCriterionForJDBCDate("STUDY_DATE >", value, "studyDate");
            return (Criteria) this;
        }

        public Criteria andStudyDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STUDY_DATE >=", value, "studyDate");
            return (Criteria) this;
        }

        public Criteria andStudyDateLessThan(Date value) {
            addCriterionForJDBCDate("STUDY_DATE <", value, "studyDate");
            return (Criteria) this;
        }

        public Criteria andStudyDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STUDY_DATE <=", value, "studyDate");
            return (Criteria) this;
        }

        public Criteria andStudyDateIn(List<Date> values) {
            addCriterionForJDBCDate("STUDY_DATE in", values, "studyDate");
            return (Criteria) this;
        }

        public Criteria andStudyDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("STUDY_DATE not in", values, "studyDate");
            return (Criteria) this;
        }

        public Criteria andStudyDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STUDY_DATE between", value1, value2, "studyDate");
            return (Criteria) this;
        }

        public Criteria andStudyDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STUDY_DATE not between", value1, value2, "studyDate");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andModalityIsNull() {
            addCriterion("MODALITY is null");
            return (Criteria) this;
        }

        public Criteria andModalityIsNotNull() {
            addCriterion("MODALITY is not null");
            return (Criteria) this;
        }

        public Criteria andModalityEqualTo(String value) {
            addCriterion("MODALITY =", value, "modality");
            return (Criteria) this;
        }

        public Criteria andModalityNotEqualTo(String value) {
            addCriterion("MODALITY <>", value, "modality");
            return (Criteria) this;
        }

        public Criteria andModalityGreaterThan(String value) {
            addCriterion("MODALITY >", value, "modality");
            return (Criteria) this;
        }

        public Criteria andModalityGreaterThanOrEqualTo(String value) {
            addCriterion("MODALITY >=", value, "modality");
            return (Criteria) this;
        }

        public Criteria andModalityLessThan(String value) {
            addCriterion("MODALITY <", value, "modality");
            return (Criteria) this;
        }

        public Criteria andModalityLessThanOrEqualTo(String value) {
            addCriterion("MODALITY <=", value, "modality");
            return (Criteria) this;
        }

        public Criteria andModalityLike(String value) {
            addCriterion("MODALITY like", value, "modality");
            return (Criteria) this;
        }

        public Criteria andModalityNotLike(String value) {
            addCriterion("MODALITY not like", value, "modality");
            return (Criteria) this;
        }

        public Criteria andModalityIn(List<String> values) {
            addCriterion("MODALITY in", values, "modality");
            return (Criteria) this;
        }

        public Criteria andModalityNotIn(List<String> values) {
            addCriterion("MODALITY not in", values, "modality");
            return (Criteria) this;
        }

        public Criteria andModalityBetween(String value1, String value2) {
            addCriterion("MODALITY between", value1, value2, "modality");
            return (Criteria) this;
        }

        public Criteria andModalityNotBetween(String value1, String value2) {
            addCriterion("MODALITY not between", value1, value2, "modality");
            return (Criteria) this;
        }

        public Criteria andBodyPartExaminedIsNull() {
            addCriterion("BODY_PART_EXAMINED is null");
            return (Criteria) this;
        }

        public Criteria andBodyPartExaminedIsNotNull() {
            addCriterion("BODY_PART_EXAMINED is not null");
            return (Criteria) this;
        }

        public Criteria andBodyPartExaminedEqualTo(String value) {
            addCriterion("BODY_PART_EXAMINED =", value, "bodyPartExamined");
            return (Criteria) this;
        }

        public Criteria andBodyPartExaminedNotEqualTo(String value) {
            addCriterion("BODY_PART_EXAMINED <>", value, "bodyPartExamined");
            return (Criteria) this;
        }

        public Criteria andBodyPartExaminedGreaterThan(String value) {
            addCriterion("BODY_PART_EXAMINED >", value, "bodyPartExamined");
            return (Criteria) this;
        }

        public Criteria andBodyPartExaminedGreaterThanOrEqualTo(String value) {
            addCriterion("BODY_PART_EXAMINED >=", value, "bodyPartExamined");
            return (Criteria) this;
        }

        public Criteria andBodyPartExaminedLessThan(String value) {
            addCriterion("BODY_PART_EXAMINED <", value, "bodyPartExamined");
            return (Criteria) this;
        }

        public Criteria andBodyPartExaminedLessThanOrEqualTo(String value) {
            addCriterion("BODY_PART_EXAMINED <=", value, "bodyPartExamined");
            return (Criteria) this;
        }

        public Criteria andBodyPartExaminedLike(String value) {
            addCriterion("BODY_PART_EXAMINED like", value, "bodyPartExamined");
            return (Criteria) this;
        }

        public Criteria andBodyPartExaminedNotLike(String value) {
            addCriterion("BODY_PART_EXAMINED not like", value, "bodyPartExamined");
            return (Criteria) this;
        }

        public Criteria andBodyPartExaminedIn(List<String> values) {
            addCriterion("BODY_PART_EXAMINED in", values, "bodyPartExamined");
            return (Criteria) this;
        }

        public Criteria andBodyPartExaminedNotIn(List<String> values) {
            addCriterion("BODY_PART_EXAMINED not in", values, "bodyPartExamined");
            return (Criteria) this;
        }

        public Criteria andBodyPartExaminedBetween(String value1, String value2) {
            addCriterion("BODY_PART_EXAMINED between", value1, value2, "bodyPartExamined");
            return (Criteria) this;
        }

        public Criteria andBodyPartExaminedNotBetween(String value1, String value2) {
            addCriterion("BODY_PART_EXAMINED not between", value1, value2, "bodyPartExamined");
            return (Criteria) this;
        }

        public Criteria andStudyDescriptionIsNull() {
            addCriterion("STUDY_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andStudyDescriptionIsNotNull() {
            addCriterion("STUDY_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andStudyDescriptionEqualTo(String value) {
            addCriterion("STUDY_DESCRIPTION =", value, "studyDescription");
            return (Criteria) this;
        }

        public Criteria andStudyDescriptionNotEqualTo(String value) {
            addCriterion("STUDY_DESCRIPTION <>", value, "studyDescription");
            return (Criteria) this;
        }

        public Criteria andStudyDescriptionGreaterThan(String value) {
            addCriterion("STUDY_DESCRIPTION >", value, "studyDescription");
            return (Criteria) this;
        }

        public Criteria andStudyDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("STUDY_DESCRIPTION >=", value, "studyDescription");
            return (Criteria) this;
        }

        public Criteria andStudyDescriptionLessThan(String value) {
            addCriterion("STUDY_DESCRIPTION <", value, "studyDescription");
            return (Criteria) this;
        }

        public Criteria andStudyDescriptionLessThanOrEqualTo(String value) {
            addCriterion("STUDY_DESCRIPTION <=", value, "studyDescription");
            return (Criteria) this;
        }

        public Criteria andStudyDescriptionLike(String value) {
            addCriterion("STUDY_DESCRIPTION like", value, "studyDescription");
            return (Criteria) this;
        }

        public Criteria andStudyDescriptionNotLike(String value) {
            addCriterion("STUDY_DESCRIPTION not like", value, "studyDescription");
            return (Criteria) this;
        }

        public Criteria andStudyDescriptionIn(List<String> values) {
            addCriterion("STUDY_DESCRIPTION in", values, "studyDescription");
            return (Criteria) this;
        }

        public Criteria andStudyDescriptionNotIn(List<String> values) {
            addCriterion("STUDY_DESCRIPTION not in", values, "studyDescription");
            return (Criteria) this;
        }

        public Criteria andStudyDescriptionBetween(String value1, String value2) {
            addCriterion("STUDY_DESCRIPTION between", value1, value2, "studyDescription");
            return (Criteria) this;
        }

        public Criteria andStudyDescriptionNotBetween(String value1, String value2) {
            addCriterion("STUDY_DESCRIPTION not between", value1, value2, "studyDescription");
            return (Criteria) this;
        }

        public Criteria andIsDiagnosedIsNull() {
            addCriterion("IS_DIAGNOSED is null");
            return (Criteria) this;
        }

        public Criteria andIsDiagnosedIsNotNull() {
            addCriterion("IS_DIAGNOSED is not null");
            return (Criteria) this;
        }

        public Criteria andIsDiagnosedEqualTo(Integer value) {
            addCriterion("IS_DIAGNOSED =", value, "isDiagnosed");
            return (Criteria) this;
        }

        public Criteria andIsDiagnosedNotEqualTo(Integer value) {
            addCriterion("IS_DIAGNOSED <>", value, "isDiagnosed");
            return (Criteria) this;
        }

        public Criteria andIsDiagnosedGreaterThan(Integer value) {
            addCriterion("IS_DIAGNOSED >", value, "isDiagnosed");
            return (Criteria) this;
        }

        public Criteria andIsDiagnosedGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_DIAGNOSED >=", value, "isDiagnosed");
            return (Criteria) this;
        }

        public Criteria andIsDiagnosedLessThan(Integer value) {
            addCriterion("IS_DIAGNOSED <", value, "isDiagnosed");
            return (Criteria) this;
        }

        public Criteria andIsDiagnosedLessThanOrEqualTo(Integer value) {
            addCriterion("IS_DIAGNOSED <=", value, "isDiagnosed");
            return (Criteria) this;
        }

        public Criteria andIsDiagnosedIn(List<Integer> values) {
            addCriterion("IS_DIAGNOSED in", values, "isDiagnosed");
            return (Criteria) this;
        }

        public Criteria andIsDiagnosedNotIn(List<Integer> values) {
            addCriterion("IS_DIAGNOSED not in", values, "isDiagnosed");
            return (Criteria) this;
        }

        public Criteria andIsDiagnosedBetween(Integer value1, Integer value2) {
            addCriterion("IS_DIAGNOSED between", value1, value2, "isDiagnosed");
            return (Criteria) this;
        }

        public Criteria andIsDiagnosedNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_DIAGNOSED not between", value1, value2, "isDiagnosed");
            return (Criteria) this;
        }

        public Criteria andDiagnoseImagePerformanceIsNull() {
            addCriterion("DIAGNOSE_IMAGE_PERFORMANCE is null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseImagePerformanceIsNotNull() {
            addCriterion("DIAGNOSE_IMAGE_PERFORMANCE is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseImagePerformanceEqualTo(String value) {
            addCriterion("DIAGNOSE_IMAGE_PERFORMANCE =", value, "diagnoseImagePerformance");
            return (Criteria) this;
        }

        public Criteria andDiagnoseImagePerformanceNotEqualTo(String value) {
            addCriterion("DIAGNOSE_IMAGE_PERFORMANCE <>", value, "diagnoseImagePerformance");
            return (Criteria) this;
        }

        public Criteria andDiagnoseImagePerformanceGreaterThan(String value) {
            addCriterion("DIAGNOSE_IMAGE_PERFORMANCE >", value, "diagnoseImagePerformance");
            return (Criteria) this;
        }

        public Criteria andDiagnoseImagePerformanceGreaterThanOrEqualTo(String value) {
            addCriterion("DIAGNOSE_IMAGE_PERFORMANCE >=", value, "diagnoseImagePerformance");
            return (Criteria) this;
        }

        public Criteria andDiagnoseImagePerformanceLessThan(String value) {
            addCriterion("DIAGNOSE_IMAGE_PERFORMANCE <", value, "diagnoseImagePerformance");
            return (Criteria) this;
        }

        public Criteria andDiagnoseImagePerformanceLessThanOrEqualTo(String value) {
            addCriterion("DIAGNOSE_IMAGE_PERFORMANCE <=", value, "diagnoseImagePerformance");
            return (Criteria) this;
        }

        public Criteria andDiagnoseImagePerformanceLike(String value) {
            addCriterion("DIAGNOSE_IMAGE_PERFORMANCE like", value, "diagnoseImagePerformance");
            return (Criteria) this;
        }

        public Criteria andDiagnoseImagePerformanceNotLike(String value) {
            addCriterion("DIAGNOSE_IMAGE_PERFORMANCE not like", value, "diagnoseImagePerformance");
            return (Criteria) this;
        }

        public Criteria andDiagnoseImagePerformanceIn(List<String> values) {
            addCriterion("DIAGNOSE_IMAGE_PERFORMANCE in", values, "diagnoseImagePerformance");
            return (Criteria) this;
        }

        public Criteria andDiagnoseImagePerformanceNotIn(List<String> values) {
            addCriterion("DIAGNOSE_IMAGE_PERFORMANCE not in", values, "diagnoseImagePerformance");
            return (Criteria) this;
        }

        public Criteria andDiagnoseImagePerformanceBetween(String value1, String value2) {
            addCriterion("DIAGNOSE_IMAGE_PERFORMANCE between", value1, value2, "diagnoseImagePerformance");
            return (Criteria) this;
        }

        public Criteria andDiagnoseImagePerformanceNotBetween(String value1, String value2) {
            addCriterion("DIAGNOSE_IMAGE_PERFORMANCE not between", value1, value2, "diagnoseImagePerformance");
            return (Criteria) this;
        }

        public Criteria andDiagnoseImageResultIsNull() {
            addCriterion("DIAGNOSE_IMAGE_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseImageResultIsNotNull() {
            addCriterion("DIAGNOSE_IMAGE_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseImageResultEqualTo(String value) {
            addCriterion("DIAGNOSE_IMAGE_RESULT =", value, "diagnoseImageResult");
            return (Criteria) this;
        }

        public Criteria andDiagnoseImageResultNotEqualTo(String value) {
            addCriterion("DIAGNOSE_IMAGE_RESULT <>", value, "diagnoseImageResult");
            return (Criteria) this;
        }

        public Criteria andDiagnoseImageResultGreaterThan(String value) {
            addCriterion("DIAGNOSE_IMAGE_RESULT >", value, "diagnoseImageResult");
            return (Criteria) this;
        }

        public Criteria andDiagnoseImageResultGreaterThanOrEqualTo(String value) {
            addCriterion("DIAGNOSE_IMAGE_RESULT >=", value, "diagnoseImageResult");
            return (Criteria) this;
        }

        public Criteria andDiagnoseImageResultLessThan(String value) {
            addCriterion("DIAGNOSE_IMAGE_RESULT <", value, "diagnoseImageResult");
            return (Criteria) this;
        }

        public Criteria andDiagnoseImageResultLessThanOrEqualTo(String value) {
            addCriterion("DIAGNOSE_IMAGE_RESULT <=", value, "diagnoseImageResult");
            return (Criteria) this;
        }

        public Criteria andDiagnoseImageResultLike(String value) {
            addCriterion("DIAGNOSE_IMAGE_RESULT like", value, "diagnoseImageResult");
            return (Criteria) this;
        }

        public Criteria andDiagnoseImageResultNotLike(String value) {
            addCriterion("DIAGNOSE_IMAGE_RESULT not like", value, "diagnoseImageResult");
            return (Criteria) this;
        }

        public Criteria andDiagnoseImageResultIn(List<String> values) {
            addCriterion("DIAGNOSE_IMAGE_RESULT in", values, "diagnoseImageResult");
            return (Criteria) this;
        }

        public Criteria andDiagnoseImageResultNotIn(List<String> values) {
            addCriterion("DIAGNOSE_IMAGE_RESULT not in", values, "diagnoseImageResult");
            return (Criteria) this;
        }

        public Criteria andDiagnoseImageResultBetween(String value1, String value2) {
            addCriterion("DIAGNOSE_IMAGE_RESULT between", value1, value2, "diagnoseImageResult");
            return (Criteria) this;
        }

        public Criteria andDiagnoseImageResultNotBetween(String value1, String value2) {
            addCriterion("DIAGNOSE_IMAGE_RESULT not between", value1, value2, "diagnoseImageResult");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserIdIsNull() {
            addCriterion("DIAGNOSE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserIdIsNotNull() {
            addCriterion("DIAGNOSE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserIdEqualTo(Integer value) {
            addCriterion("DIAGNOSE_USER_ID =", value, "diagnoseUserId");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserIdNotEqualTo(Integer value) {
            addCriterion("DIAGNOSE_USER_ID <>", value, "diagnoseUserId");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserIdGreaterThan(Integer value) {
            addCriterion("DIAGNOSE_USER_ID >", value, "diagnoseUserId");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DIAGNOSE_USER_ID >=", value, "diagnoseUserId");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserIdLessThan(Integer value) {
            addCriterion("DIAGNOSE_USER_ID <", value, "diagnoseUserId");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("DIAGNOSE_USER_ID <=", value, "diagnoseUserId");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserIdIn(List<Integer> values) {
            addCriterion("DIAGNOSE_USER_ID in", values, "diagnoseUserId");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserIdNotIn(List<Integer> values) {
            addCriterion("DIAGNOSE_USER_ID not in", values, "diagnoseUserId");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserIdBetween(Integer value1, Integer value2) {
            addCriterion("DIAGNOSE_USER_ID between", value1, value2, "diagnoseUserId");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DIAGNOSE_USER_ID not between", value1, value2, "diagnoseUserId");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTimeIsNull() {
            addCriterion("DIAGNOSE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTimeIsNotNull() {
            addCriterion("DIAGNOSE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTimeEqualTo(Date value) {
            addCriterion("DIAGNOSE_TIME =", value, "diagnoseTime");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTimeNotEqualTo(Date value) {
            addCriterion("DIAGNOSE_TIME <>", value, "diagnoseTime");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTimeGreaterThan(Date value) {
            addCriterion("DIAGNOSE_TIME >", value, "diagnoseTime");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DIAGNOSE_TIME >=", value, "diagnoseTime");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTimeLessThan(Date value) {
            addCriterion("DIAGNOSE_TIME <", value, "diagnoseTime");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTimeLessThanOrEqualTo(Date value) {
            addCriterion("DIAGNOSE_TIME <=", value, "diagnoseTime");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTimeIn(List<Date> values) {
            addCriterion("DIAGNOSE_TIME in", values, "diagnoseTime");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTimeNotIn(List<Date> values) {
            addCriterion("DIAGNOSE_TIME not in", values, "diagnoseTime");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTimeBetween(Date value1, Date value2) {
            addCriterion("DIAGNOSE_TIME between", value1, value2, "diagnoseTime");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTimeNotBetween(Date value1, Date value2) {
            addCriterion("DIAGNOSE_TIME not between", value1, value2, "diagnoseTime");
            return (Criteria) this;
        }

        public Criteria andIsFirstReviewedIsNull() {
            addCriterion("IS_FIRST_REVIEWED is null");
            return (Criteria) this;
        }

        public Criteria andIsFirstReviewedIsNotNull() {
            addCriterion("IS_FIRST_REVIEWED is not null");
            return (Criteria) this;
        }

        public Criteria andIsFirstReviewedEqualTo(Integer value) {
            addCriterion("IS_FIRST_REVIEWED =", value, "isFirstReviewed");
            return (Criteria) this;
        }

        public Criteria andIsFirstReviewedNotEqualTo(Integer value) {
            addCriterion("IS_FIRST_REVIEWED <>", value, "isFirstReviewed");
            return (Criteria) this;
        }

        public Criteria andIsFirstReviewedGreaterThan(Integer value) {
            addCriterion("IS_FIRST_REVIEWED >", value, "isFirstReviewed");
            return (Criteria) this;
        }

        public Criteria andIsFirstReviewedGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_FIRST_REVIEWED >=", value, "isFirstReviewed");
            return (Criteria) this;
        }

        public Criteria andIsFirstReviewedLessThan(Integer value) {
            addCriterion("IS_FIRST_REVIEWED <", value, "isFirstReviewed");
            return (Criteria) this;
        }

        public Criteria andIsFirstReviewedLessThanOrEqualTo(Integer value) {
            addCriterion("IS_FIRST_REVIEWED <=", value, "isFirstReviewed");
            return (Criteria) this;
        }

        public Criteria andIsFirstReviewedIn(List<Integer> values) {
            addCriterion("IS_FIRST_REVIEWED in", values, "isFirstReviewed");
            return (Criteria) this;
        }

        public Criteria andIsFirstReviewedNotIn(List<Integer> values) {
            addCriterion("IS_FIRST_REVIEWED not in", values, "isFirstReviewed");
            return (Criteria) this;
        }

        public Criteria andIsFirstReviewedBetween(Integer value1, Integer value2) {
            addCriterion("IS_FIRST_REVIEWED between", value1, value2, "isFirstReviewed");
            return (Criteria) this;
        }

        public Criteria andIsFirstReviewedNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_FIRST_REVIEWED not between", value1, value2, "isFirstReviewed");
            return (Criteria) this;
        }

        public Criteria andFirstReviewImagePerformanceIsNull() {
            addCriterion("FIRST_REVIEW_IMAGE_PERFORMANCE is null");
            return (Criteria) this;
        }

        public Criteria andFirstReviewImagePerformanceIsNotNull() {
            addCriterion("FIRST_REVIEW_IMAGE_PERFORMANCE is not null");
            return (Criteria) this;
        }

        public Criteria andFirstReviewImagePerformanceEqualTo(String value) {
            addCriterion("FIRST_REVIEW_IMAGE_PERFORMANCE =", value, "firstReviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andFirstReviewImagePerformanceNotEqualTo(String value) {
            addCriterion("FIRST_REVIEW_IMAGE_PERFORMANCE <>", value, "firstReviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andFirstReviewImagePerformanceGreaterThan(String value) {
            addCriterion("FIRST_REVIEW_IMAGE_PERFORMANCE >", value, "firstReviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andFirstReviewImagePerformanceGreaterThanOrEqualTo(String value) {
            addCriterion("FIRST_REVIEW_IMAGE_PERFORMANCE >=", value, "firstReviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andFirstReviewImagePerformanceLessThan(String value) {
            addCriterion("FIRST_REVIEW_IMAGE_PERFORMANCE <", value, "firstReviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andFirstReviewImagePerformanceLessThanOrEqualTo(String value) {
            addCriterion("FIRST_REVIEW_IMAGE_PERFORMANCE <=", value, "firstReviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andFirstReviewImagePerformanceLike(String value) {
            addCriterion("FIRST_REVIEW_IMAGE_PERFORMANCE like", value, "firstReviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andFirstReviewImagePerformanceNotLike(String value) {
            addCriterion("FIRST_REVIEW_IMAGE_PERFORMANCE not like", value, "firstReviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andFirstReviewImagePerformanceIn(List<String> values) {
            addCriterion("FIRST_REVIEW_IMAGE_PERFORMANCE in", values, "firstReviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andFirstReviewImagePerformanceNotIn(List<String> values) {
            addCriterion("FIRST_REVIEW_IMAGE_PERFORMANCE not in", values, "firstReviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andFirstReviewImagePerformanceBetween(String value1, String value2) {
            addCriterion("FIRST_REVIEW_IMAGE_PERFORMANCE between", value1, value2, "firstReviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andFirstReviewImagePerformanceNotBetween(String value1, String value2) {
            addCriterion("FIRST_REVIEW_IMAGE_PERFORMANCE not between", value1, value2, "firstReviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andFirstReviewImageResultIsNull() {
            addCriterion("FIRST_REVIEW_IMAGE_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andFirstReviewImageResultIsNotNull() {
            addCriterion("FIRST_REVIEW_IMAGE_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andFirstReviewImageResultEqualTo(String value) {
            addCriterion("FIRST_REVIEW_IMAGE_RESULT =", value, "firstReviewImageResult");
            return (Criteria) this;
        }

        public Criteria andFirstReviewImageResultNotEqualTo(String value) {
            addCriterion("FIRST_REVIEW_IMAGE_RESULT <>", value, "firstReviewImageResult");
            return (Criteria) this;
        }

        public Criteria andFirstReviewImageResultGreaterThan(String value) {
            addCriterion("FIRST_REVIEW_IMAGE_RESULT >", value, "firstReviewImageResult");
            return (Criteria) this;
        }

        public Criteria andFirstReviewImageResultGreaterThanOrEqualTo(String value) {
            addCriterion("FIRST_REVIEW_IMAGE_RESULT >=", value, "firstReviewImageResult");
            return (Criteria) this;
        }

        public Criteria andFirstReviewImageResultLessThan(String value) {
            addCriterion("FIRST_REVIEW_IMAGE_RESULT <", value, "firstReviewImageResult");
            return (Criteria) this;
        }

        public Criteria andFirstReviewImageResultLessThanOrEqualTo(String value) {
            addCriterion("FIRST_REVIEW_IMAGE_RESULT <=", value, "firstReviewImageResult");
            return (Criteria) this;
        }

        public Criteria andFirstReviewImageResultLike(String value) {
            addCriterion("FIRST_REVIEW_IMAGE_RESULT like", value, "firstReviewImageResult");
            return (Criteria) this;
        }

        public Criteria andFirstReviewImageResultNotLike(String value) {
            addCriterion("FIRST_REVIEW_IMAGE_RESULT not like", value, "firstReviewImageResult");
            return (Criteria) this;
        }

        public Criteria andFirstReviewImageResultIn(List<String> values) {
            addCriterion("FIRST_REVIEW_IMAGE_RESULT in", values, "firstReviewImageResult");
            return (Criteria) this;
        }

        public Criteria andFirstReviewImageResultNotIn(List<String> values) {
            addCriterion("FIRST_REVIEW_IMAGE_RESULT not in", values, "firstReviewImageResult");
            return (Criteria) this;
        }

        public Criteria andFirstReviewImageResultBetween(String value1, String value2) {
            addCriterion("FIRST_REVIEW_IMAGE_RESULT between", value1, value2, "firstReviewImageResult");
            return (Criteria) this;
        }

        public Criteria andFirstReviewImageResultNotBetween(String value1, String value2) {
            addCriterion("FIRST_REVIEW_IMAGE_RESULT not between", value1, value2, "firstReviewImageResult");
            return (Criteria) this;
        }

        public Criteria andFirstReviewUserIdIsNull() {
            addCriterion("FIRST_REVIEW_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andFirstReviewUserIdIsNotNull() {
            addCriterion("FIRST_REVIEW_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFirstReviewUserIdEqualTo(Integer value) {
            addCriterion("FIRST_REVIEW_USER_ID =", value, "firstReviewUserId");
            return (Criteria) this;
        }

        public Criteria andFirstReviewUserIdNotEqualTo(Integer value) {
            addCriterion("FIRST_REVIEW_USER_ID <>", value, "firstReviewUserId");
            return (Criteria) this;
        }

        public Criteria andFirstReviewUserIdGreaterThan(Integer value) {
            addCriterion("FIRST_REVIEW_USER_ID >", value, "firstReviewUserId");
            return (Criteria) this;
        }

        public Criteria andFirstReviewUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FIRST_REVIEW_USER_ID >=", value, "firstReviewUserId");
            return (Criteria) this;
        }

        public Criteria andFirstReviewUserIdLessThan(Integer value) {
            addCriterion("FIRST_REVIEW_USER_ID <", value, "firstReviewUserId");
            return (Criteria) this;
        }

        public Criteria andFirstReviewUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("FIRST_REVIEW_USER_ID <=", value, "firstReviewUserId");
            return (Criteria) this;
        }

        public Criteria andFirstReviewUserIdIn(List<Integer> values) {
            addCriterion("FIRST_REVIEW_USER_ID in", values, "firstReviewUserId");
            return (Criteria) this;
        }

        public Criteria andFirstReviewUserIdNotIn(List<Integer> values) {
            addCriterion("FIRST_REVIEW_USER_ID not in", values, "firstReviewUserId");
            return (Criteria) this;
        }

        public Criteria andFirstReviewUserIdBetween(Integer value1, Integer value2) {
            addCriterion("FIRST_REVIEW_USER_ID between", value1, value2, "firstReviewUserId");
            return (Criteria) this;
        }

        public Criteria andFirstReviewUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FIRST_REVIEW_USER_ID not between", value1, value2, "firstReviewUserId");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeIsNull() {
            addCriterion("FIRST_REVIEW_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeIsNotNull() {
            addCriterion("FIRST_REVIEW_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeEqualTo(Date value) {
            addCriterion("FIRST_REVIEW_TIME =", value, "firstReviewTime");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeNotEqualTo(Date value) {
            addCriterion("FIRST_REVIEW_TIME <>", value, "firstReviewTime");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeGreaterThan(Date value) {
            addCriterion("FIRST_REVIEW_TIME >", value, "firstReviewTime");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FIRST_REVIEW_TIME >=", value, "firstReviewTime");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeLessThan(Date value) {
            addCriterion("FIRST_REVIEW_TIME <", value, "firstReviewTime");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeLessThanOrEqualTo(Date value) {
            addCriterion("FIRST_REVIEW_TIME <=", value, "firstReviewTime");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeIn(List<Date> values) {
            addCriterion("FIRST_REVIEW_TIME in", values, "firstReviewTime");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeNotIn(List<Date> values) {
            addCriterion("FIRST_REVIEW_TIME not in", values, "firstReviewTime");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeBetween(Date value1, Date value2) {
            addCriterion("FIRST_REVIEW_TIME between", value1, value2, "firstReviewTime");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeNotBetween(Date value1, Date value2) {
            addCriterion("FIRST_REVIEW_TIME not between", value1, value2, "firstReviewTime");
            return (Criteria) this;
        }

        public Criteria andIsFinalReviewedIsNull() {
            addCriterion("IS_FINAL_REVIEWED is null");
            return (Criteria) this;
        }

        public Criteria andIsFinalReviewedIsNotNull() {
            addCriterion("IS_FINAL_REVIEWED is not null");
            return (Criteria) this;
        }

        public Criteria andIsFinalReviewedEqualTo(Integer value) {
            addCriterion("IS_FINAL_REVIEWED =", value, "isFinalReviewed");
            return (Criteria) this;
        }

        public Criteria andIsFinalReviewedNotEqualTo(Integer value) {
            addCriterion("IS_FINAL_REVIEWED <>", value, "isFinalReviewed");
            return (Criteria) this;
        }

        public Criteria andIsFinalReviewedGreaterThan(Integer value) {
            addCriterion("IS_FINAL_REVIEWED >", value, "isFinalReviewed");
            return (Criteria) this;
        }

        public Criteria andIsFinalReviewedGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_FINAL_REVIEWED >=", value, "isFinalReviewed");
            return (Criteria) this;
        }

        public Criteria andIsFinalReviewedLessThan(Integer value) {
            addCriterion("IS_FINAL_REVIEWED <", value, "isFinalReviewed");
            return (Criteria) this;
        }

        public Criteria andIsFinalReviewedLessThanOrEqualTo(Integer value) {
            addCriterion("IS_FINAL_REVIEWED <=", value, "isFinalReviewed");
            return (Criteria) this;
        }

        public Criteria andIsFinalReviewedIn(List<Integer> values) {
            addCriterion("IS_FINAL_REVIEWED in", values, "isFinalReviewed");
            return (Criteria) this;
        }

        public Criteria andIsFinalReviewedNotIn(List<Integer> values) {
            addCriterion("IS_FINAL_REVIEWED not in", values, "isFinalReviewed");
            return (Criteria) this;
        }

        public Criteria andIsFinalReviewedBetween(Integer value1, Integer value2) {
            addCriterion("IS_FINAL_REVIEWED between", value1, value2, "isFinalReviewed");
            return (Criteria) this;
        }

        public Criteria andIsFinalReviewedNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_FINAL_REVIEWED not between", value1, value2, "isFinalReviewed");
            return (Criteria) this;
        }

        public Criteria andFinalReviewImagePerformanceIsNull() {
            addCriterion("FINAL_REVIEW_IMAGE_PERFORMANCE is null");
            return (Criteria) this;
        }

        public Criteria andFinalReviewImagePerformanceIsNotNull() {
            addCriterion("FINAL_REVIEW_IMAGE_PERFORMANCE is not null");
            return (Criteria) this;
        }

        public Criteria andFinalReviewImagePerformanceEqualTo(String value) {
            addCriterion("FINAL_REVIEW_IMAGE_PERFORMANCE =", value, "finalReviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andFinalReviewImagePerformanceNotEqualTo(String value) {
            addCriterion("FINAL_REVIEW_IMAGE_PERFORMANCE <>", value, "finalReviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andFinalReviewImagePerformanceGreaterThan(String value) {
            addCriterion("FINAL_REVIEW_IMAGE_PERFORMANCE >", value, "finalReviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andFinalReviewImagePerformanceGreaterThanOrEqualTo(String value) {
            addCriterion("FINAL_REVIEW_IMAGE_PERFORMANCE >=", value, "finalReviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andFinalReviewImagePerformanceLessThan(String value) {
            addCriterion("FINAL_REVIEW_IMAGE_PERFORMANCE <", value, "finalReviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andFinalReviewImagePerformanceLessThanOrEqualTo(String value) {
            addCriterion("FINAL_REVIEW_IMAGE_PERFORMANCE <=", value, "finalReviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andFinalReviewImagePerformanceLike(String value) {
            addCriterion("FINAL_REVIEW_IMAGE_PERFORMANCE like", value, "finalReviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andFinalReviewImagePerformanceNotLike(String value) {
            addCriterion("FINAL_REVIEW_IMAGE_PERFORMANCE not like", value, "finalReviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andFinalReviewImagePerformanceIn(List<String> values) {
            addCriterion("FINAL_REVIEW_IMAGE_PERFORMANCE in", values, "finalReviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andFinalReviewImagePerformanceNotIn(List<String> values) {
            addCriterion("FINAL_REVIEW_IMAGE_PERFORMANCE not in", values, "finalReviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andFinalReviewImagePerformanceBetween(String value1, String value2) {
            addCriterion("FINAL_REVIEW_IMAGE_PERFORMANCE between", value1, value2, "finalReviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andFinalReviewImagePerformanceNotBetween(String value1, String value2) {
            addCriterion("FINAL_REVIEW_IMAGE_PERFORMANCE not between", value1, value2, "finalReviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andFinalReviewImageResultIsNull() {
            addCriterion("FINAL_REVIEW_IMAGE_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andFinalReviewImageResultIsNotNull() {
            addCriterion("FINAL_REVIEW_IMAGE_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andFinalReviewImageResultEqualTo(String value) {
            addCriterion("FINAL_REVIEW_IMAGE_RESULT =", value, "finalReviewImageResult");
            return (Criteria) this;
        }

        public Criteria andFinalReviewImageResultNotEqualTo(String value) {
            addCriterion("FINAL_REVIEW_IMAGE_RESULT <>", value, "finalReviewImageResult");
            return (Criteria) this;
        }

        public Criteria andFinalReviewImageResultGreaterThan(String value) {
            addCriterion("FINAL_REVIEW_IMAGE_RESULT >", value, "finalReviewImageResult");
            return (Criteria) this;
        }

        public Criteria andFinalReviewImageResultGreaterThanOrEqualTo(String value) {
            addCriterion("FINAL_REVIEW_IMAGE_RESULT >=", value, "finalReviewImageResult");
            return (Criteria) this;
        }

        public Criteria andFinalReviewImageResultLessThan(String value) {
            addCriterion("FINAL_REVIEW_IMAGE_RESULT <", value, "finalReviewImageResult");
            return (Criteria) this;
        }

        public Criteria andFinalReviewImageResultLessThanOrEqualTo(String value) {
            addCriterion("FINAL_REVIEW_IMAGE_RESULT <=", value, "finalReviewImageResult");
            return (Criteria) this;
        }

        public Criteria andFinalReviewImageResultLike(String value) {
            addCriterion("FINAL_REVIEW_IMAGE_RESULT like", value, "finalReviewImageResult");
            return (Criteria) this;
        }

        public Criteria andFinalReviewImageResultNotLike(String value) {
            addCriterion("FINAL_REVIEW_IMAGE_RESULT not like", value, "finalReviewImageResult");
            return (Criteria) this;
        }

        public Criteria andFinalReviewImageResultIn(List<String> values) {
            addCriterion("FINAL_REVIEW_IMAGE_RESULT in", values, "finalReviewImageResult");
            return (Criteria) this;
        }

        public Criteria andFinalReviewImageResultNotIn(List<String> values) {
            addCriterion("FINAL_REVIEW_IMAGE_RESULT not in", values, "finalReviewImageResult");
            return (Criteria) this;
        }

        public Criteria andFinalReviewImageResultBetween(String value1, String value2) {
            addCriterion("FINAL_REVIEW_IMAGE_RESULT between", value1, value2, "finalReviewImageResult");
            return (Criteria) this;
        }

        public Criteria andFinalReviewImageResultNotBetween(String value1, String value2) {
            addCriterion("FINAL_REVIEW_IMAGE_RESULT not between", value1, value2, "finalReviewImageResult");
            return (Criteria) this;
        }

        public Criteria andFinalReviewRemarkIsNull() {
            addCriterion("FINAL_REVIEW_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andFinalReviewRemarkIsNotNull() {
            addCriterion("FINAL_REVIEW_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andFinalReviewRemarkEqualTo(Integer value) {
            addCriterion("FINAL_REVIEW_REMARK =", value, "finalReviewRemark");
            return (Criteria) this;
        }

        public Criteria andFinalReviewRemarkNotEqualTo(Integer value) {
            addCriterion("FINAL_REVIEW_REMARK <>", value, "finalReviewRemark");
            return (Criteria) this;
        }

        public Criteria andFinalReviewRemarkGreaterThan(Integer value) {
            addCriterion("FINAL_REVIEW_REMARK >", value, "finalReviewRemark");
            return (Criteria) this;
        }

        public Criteria andFinalReviewRemarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("FINAL_REVIEW_REMARK >=", value, "finalReviewRemark");
            return (Criteria) this;
        }

        public Criteria andFinalReviewRemarkLessThan(Integer value) {
            addCriterion("FINAL_REVIEW_REMARK <", value, "finalReviewRemark");
            return (Criteria) this;
        }

        public Criteria andFinalReviewRemarkLessThanOrEqualTo(Integer value) {
            addCriterion("FINAL_REVIEW_REMARK <=", value, "finalReviewRemark");
            return (Criteria) this;
        }

        public Criteria andFinalReviewRemarkIn(List<Integer> values) {
            addCriterion("FINAL_REVIEW_REMARK in", values, "finalReviewRemark");
            return (Criteria) this;
        }

        public Criteria andFinalReviewRemarkNotIn(List<Integer> values) {
            addCriterion("FINAL_REVIEW_REMARK not in", values, "finalReviewRemark");
            return (Criteria) this;
        }

        public Criteria andFinalReviewRemarkBetween(Integer value1, Integer value2) {
            addCriterion("FINAL_REVIEW_REMARK between", value1, value2, "finalReviewRemark");
            return (Criteria) this;
        }

        public Criteria andFinalReviewRemarkNotBetween(Integer value1, Integer value2) {
            addCriterion("FINAL_REVIEW_REMARK not between", value1, value2, "finalReviewRemark");
            return (Criteria) this;
        }

        public Criteria andFinalReviewUserIdIsNull() {
            addCriterion("FINAL_REVIEW_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andFinalReviewUserIdIsNotNull() {
            addCriterion("FINAL_REVIEW_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFinalReviewUserIdEqualTo(Integer value) {
            addCriterion("FINAL_REVIEW_USER_ID =", value, "finalReviewUserId");
            return (Criteria) this;
        }

        public Criteria andFinalReviewUserIdNotEqualTo(Integer value) {
            addCriterion("FINAL_REVIEW_USER_ID <>", value, "finalReviewUserId");
            return (Criteria) this;
        }

        public Criteria andFinalReviewUserIdGreaterThan(Integer value) {
            addCriterion("FINAL_REVIEW_USER_ID >", value, "finalReviewUserId");
            return (Criteria) this;
        }

        public Criteria andFinalReviewUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FINAL_REVIEW_USER_ID >=", value, "finalReviewUserId");
            return (Criteria) this;
        }

        public Criteria andFinalReviewUserIdLessThan(Integer value) {
            addCriterion("FINAL_REVIEW_USER_ID <", value, "finalReviewUserId");
            return (Criteria) this;
        }

        public Criteria andFinalReviewUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("FINAL_REVIEW_USER_ID <=", value, "finalReviewUserId");
            return (Criteria) this;
        }

        public Criteria andFinalReviewUserIdIn(List<Integer> values) {
            addCriterion("FINAL_REVIEW_USER_ID in", values, "finalReviewUserId");
            return (Criteria) this;
        }

        public Criteria andFinalReviewUserIdNotIn(List<Integer> values) {
            addCriterion("FINAL_REVIEW_USER_ID not in", values, "finalReviewUserId");
            return (Criteria) this;
        }

        public Criteria andFinalReviewUserIdBetween(Integer value1, Integer value2) {
            addCriterion("FINAL_REVIEW_USER_ID between", value1, value2, "finalReviewUserId");
            return (Criteria) this;
        }

        public Criteria andFinalReviewUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FINAL_REVIEW_USER_ID not between", value1, value2, "finalReviewUserId");
            return (Criteria) this;
        }

        public Criteria andFinalReviewTimeIsNull() {
            addCriterion("FINAL_REVIEW_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFinalReviewTimeIsNotNull() {
            addCriterion("FINAL_REVIEW_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFinalReviewTimeEqualTo(Date value) {
            addCriterion("FINAL_REVIEW_TIME =", value, "finalReviewTime");
            return (Criteria) this;
        }

        public Criteria andFinalReviewTimeNotEqualTo(Date value) {
            addCriterion("FINAL_REVIEW_TIME <>", value, "finalReviewTime");
            return (Criteria) this;
        }

        public Criteria andFinalReviewTimeGreaterThan(Date value) {
            addCriterion("FINAL_REVIEW_TIME >", value, "finalReviewTime");
            return (Criteria) this;
        }

        public Criteria andFinalReviewTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FINAL_REVIEW_TIME >=", value, "finalReviewTime");
            return (Criteria) this;
        }

        public Criteria andFinalReviewTimeLessThan(Date value) {
            addCriterion("FINAL_REVIEW_TIME <", value, "finalReviewTime");
            return (Criteria) this;
        }

        public Criteria andFinalReviewTimeLessThanOrEqualTo(Date value) {
            addCriterion("FINAL_REVIEW_TIME <=", value, "finalReviewTime");
            return (Criteria) this;
        }

        public Criteria andFinalReviewTimeIn(List<Date> values) {
            addCriterion("FINAL_REVIEW_TIME in", values, "finalReviewTime");
            return (Criteria) this;
        }

        public Criteria andFinalReviewTimeNotIn(List<Date> values) {
            addCriterion("FINAL_REVIEW_TIME not in", values, "finalReviewTime");
            return (Criteria) this;
        }

        public Criteria andFinalReviewTimeBetween(Date value1, Date value2) {
            addCriterion("FINAL_REVIEW_TIME between", value1, value2, "finalReviewTime");
            return (Criteria) this;
        }

        public Criteria andFinalReviewTimeNotBetween(Date value1, Date value2) {
            addCriterion("FINAL_REVIEW_TIME not between", value1, value2, "finalReviewTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}