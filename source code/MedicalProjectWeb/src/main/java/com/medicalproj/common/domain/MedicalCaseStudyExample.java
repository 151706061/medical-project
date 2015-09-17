package com.medicalproj.common.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MedicalCaseStudyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedicalCaseStudyExample() {
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

        public Criteria andSeriesNumberIsNull() {
            addCriterion("SERIES_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andSeriesNumberIsNotNull() {
            addCriterion("SERIES_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesNumberEqualTo(String value) {
            addCriterion("SERIES_NUMBER =", value, "seriesNumber");
            return (Criteria) this;
        }

        public Criteria andSeriesNumberNotEqualTo(String value) {
            addCriterion("SERIES_NUMBER <>", value, "seriesNumber");
            return (Criteria) this;
        }

        public Criteria andSeriesNumberGreaterThan(String value) {
            addCriterion("SERIES_NUMBER >", value, "seriesNumber");
            return (Criteria) this;
        }

        public Criteria andSeriesNumberGreaterThanOrEqualTo(String value) {
            addCriterion("SERIES_NUMBER >=", value, "seriesNumber");
            return (Criteria) this;
        }

        public Criteria andSeriesNumberLessThan(String value) {
            addCriterion("SERIES_NUMBER <", value, "seriesNumber");
            return (Criteria) this;
        }

        public Criteria andSeriesNumberLessThanOrEqualTo(String value) {
            addCriterion("SERIES_NUMBER <=", value, "seriesNumber");
            return (Criteria) this;
        }

        public Criteria andSeriesNumberLike(String value) {
            addCriterion("SERIES_NUMBER like", value, "seriesNumber");
            return (Criteria) this;
        }

        public Criteria andSeriesNumberNotLike(String value) {
            addCriterion("SERIES_NUMBER not like", value, "seriesNumber");
            return (Criteria) this;
        }

        public Criteria andSeriesNumberIn(List<String> values) {
            addCriterion("SERIES_NUMBER in", values, "seriesNumber");
            return (Criteria) this;
        }

        public Criteria andSeriesNumberNotIn(List<String> values) {
            addCriterion("SERIES_NUMBER not in", values, "seriesNumber");
            return (Criteria) this;
        }

        public Criteria andSeriesNumberBetween(String value1, String value2) {
            addCriterion("SERIES_NUMBER between", value1, value2, "seriesNumber");
            return (Criteria) this;
        }

        public Criteria andSeriesNumberNotBetween(String value1, String value2) {
            addCriterion("SERIES_NUMBER not between", value1, value2, "seriesNumber");
            return (Criteria) this;
        }

        public Criteria andInstanceNumberIsNull() {
            addCriterion("INSTANCE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andInstanceNumberIsNotNull() {
            addCriterion("INSTANCE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andInstanceNumberEqualTo(String value) {
            addCriterion("INSTANCE_NUMBER =", value, "instanceNumber");
            return (Criteria) this;
        }

        public Criteria andInstanceNumberNotEqualTo(String value) {
            addCriterion("INSTANCE_NUMBER <>", value, "instanceNumber");
            return (Criteria) this;
        }

        public Criteria andInstanceNumberGreaterThan(String value) {
            addCriterion("INSTANCE_NUMBER >", value, "instanceNumber");
            return (Criteria) this;
        }

        public Criteria andInstanceNumberGreaterThanOrEqualTo(String value) {
            addCriterion("INSTANCE_NUMBER >=", value, "instanceNumber");
            return (Criteria) this;
        }

        public Criteria andInstanceNumberLessThan(String value) {
            addCriterion("INSTANCE_NUMBER <", value, "instanceNumber");
            return (Criteria) this;
        }

        public Criteria andInstanceNumberLessThanOrEqualTo(String value) {
            addCriterion("INSTANCE_NUMBER <=", value, "instanceNumber");
            return (Criteria) this;
        }

        public Criteria andInstanceNumberLike(String value) {
            addCriterion("INSTANCE_NUMBER like", value, "instanceNumber");
            return (Criteria) this;
        }

        public Criteria andInstanceNumberNotLike(String value) {
            addCriterion("INSTANCE_NUMBER not like", value, "instanceNumber");
            return (Criteria) this;
        }

        public Criteria andInstanceNumberIn(List<String> values) {
            addCriterion("INSTANCE_NUMBER in", values, "instanceNumber");
            return (Criteria) this;
        }

        public Criteria andInstanceNumberNotIn(List<String> values) {
            addCriterion("INSTANCE_NUMBER not in", values, "instanceNumber");
            return (Criteria) this;
        }

        public Criteria andInstanceNumberBetween(String value1, String value2) {
            addCriterion("INSTANCE_NUMBER between", value1, value2, "instanceNumber");
            return (Criteria) this;
        }

        public Criteria andInstanceNumberNotBetween(String value1, String value2) {
            addCriterion("INSTANCE_NUMBER not between", value1, value2, "instanceNumber");
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

        public Criteria andPatientPositionIsNull() {
            addCriterion("PATIENT_POSITION is null");
            return (Criteria) this;
        }

        public Criteria andPatientPositionIsNotNull() {
            addCriterion("PATIENT_POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andPatientPositionEqualTo(String value) {
            addCriterion("PATIENT_POSITION =", value, "patientPosition");
            return (Criteria) this;
        }

        public Criteria andPatientPositionNotEqualTo(String value) {
            addCriterion("PATIENT_POSITION <>", value, "patientPosition");
            return (Criteria) this;
        }

        public Criteria andPatientPositionGreaterThan(String value) {
            addCriterion("PATIENT_POSITION >", value, "patientPosition");
            return (Criteria) this;
        }

        public Criteria andPatientPositionGreaterThanOrEqualTo(String value) {
            addCriterion("PATIENT_POSITION >=", value, "patientPosition");
            return (Criteria) this;
        }

        public Criteria andPatientPositionLessThan(String value) {
            addCriterion("PATIENT_POSITION <", value, "patientPosition");
            return (Criteria) this;
        }

        public Criteria andPatientPositionLessThanOrEqualTo(String value) {
            addCriterion("PATIENT_POSITION <=", value, "patientPosition");
            return (Criteria) this;
        }

        public Criteria andPatientPositionLike(String value) {
            addCriterion("PATIENT_POSITION like", value, "patientPosition");
            return (Criteria) this;
        }

        public Criteria andPatientPositionNotLike(String value) {
            addCriterion("PATIENT_POSITION not like", value, "patientPosition");
            return (Criteria) this;
        }

        public Criteria andPatientPositionIn(List<String> values) {
            addCriterion("PATIENT_POSITION in", values, "patientPosition");
            return (Criteria) this;
        }

        public Criteria andPatientPositionNotIn(List<String> values) {
            addCriterion("PATIENT_POSITION not in", values, "patientPosition");
            return (Criteria) this;
        }

        public Criteria andPatientPositionBetween(String value1, String value2) {
            addCriterion("PATIENT_POSITION between", value1, value2, "patientPosition");
            return (Criteria) this;
        }

        public Criteria andPatientPositionNotBetween(String value1, String value2) {
            addCriterion("PATIENT_POSITION not between", value1, value2, "patientPosition");
            return (Criteria) this;
        }

        public Criteria andAcquisitionDatetimeIsNull() {
            addCriterion("ACQUISITION_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andAcquisitionDatetimeIsNotNull() {
            addCriterion("ACQUISITION_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andAcquisitionDatetimeEqualTo(Date value) {
            addCriterion("ACQUISITION_DATETIME =", value, "acquisitionDatetime");
            return (Criteria) this;
        }

        public Criteria andAcquisitionDatetimeNotEqualTo(Date value) {
            addCriterion("ACQUISITION_DATETIME <>", value, "acquisitionDatetime");
            return (Criteria) this;
        }

        public Criteria andAcquisitionDatetimeGreaterThan(Date value) {
            addCriterion("ACQUISITION_DATETIME >", value, "acquisitionDatetime");
            return (Criteria) this;
        }

        public Criteria andAcquisitionDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ACQUISITION_DATETIME >=", value, "acquisitionDatetime");
            return (Criteria) this;
        }

        public Criteria andAcquisitionDatetimeLessThan(Date value) {
            addCriterion("ACQUISITION_DATETIME <", value, "acquisitionDatetime");
            return (Criteria) this;
        }

        public Criteria andAcquisitionDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("ACQUISITION_DATETIME <=", value, "acquisitionDatetime");
            return (Criteria) this;
        }

        public Criteria andAcquisitionDatetimeIn(List<Date> values) {
            addCriterion("ACQUISITION_DATETIME in", values, "acquisitionDatetime");
            return (Criteria) this;
        }

        public Criteria andAcquisitionDatetimeNotIn(List<Date> values) {
            addCriterion("ACQUISITION_DATETIME not in", values, "acquisitionDatetime");
            return (Criteria) this;
        }

        public Criteria andAcquisitionDatetimeBetween(Date value1, Date value2) {
            addCriterion("ACQUISITION_DATETIME between", value1, value2, "acquisitionDatetime");
            return (Criteria) this;
        }

        public Criteria andAcquisitionDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("ACQUISITION_DATETIME not between", value1, value2, "acquisitionDatetime");
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