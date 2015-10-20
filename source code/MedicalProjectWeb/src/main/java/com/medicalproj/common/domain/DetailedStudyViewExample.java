package com.medicalproj.common.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DetailedStudyViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DetailedStudyViewExample() {
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

        public Criteria andStudyIdIsNull() {
            addCriterion("STUDY_ID is null");
            return (Criteria) this;
        }

        public Criteria andStudyIdIsNotNull() {
            addCriterion("STUDY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStudyIdEqualTo(Integer value) {
            addCriterion("STUDY_ID =", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdNotEqualTo(Integer value) {
            addCriterion("STUDY_ID <>", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdGreaterThan(Integer value) {
            addCriterion("STUDY_ID >", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("STUDY_ID >=", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdLessThan(Integer value) {
            addCriterion("STUDY_ID <", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdLessThanOrEqualTo(Integer value) {
            addCriterion("STUDY_ID <=", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdIn(List<Integer> values) {
            addCriterion("STUDY_ID in", values, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdNotIn(List<Integer> values) {
            addCriterion("STUDY_ID not in", values, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdBetween(Integer value1, Integer value2) {
            addCriterion("STUDY_ID between", value1, value2, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("STUDY_ID not between", value1, value2, "studyId");
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

        public Criteria andPatientIdIsNull() {
            addCriterion("PATIENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPatientIdIsNotNull() {
            addCriterion("PATIENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPatientIdEqualTo(String value) {
            addCriterion("PATIENT_ID =", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotEqualTo(String value) {
            addCriterion("PATIENT_ID <>", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThan(String value) {
            addCriterion("PATIENT_ID >", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThanOrEqualTo(String value) {
            addCriterion("PATIENT_ID >=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThan(String value) {
            addCriterion("PATIENT_ID <", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThanOrEqualTo(String value) {
            addCriterion("PATIENT_ID <=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLike(String value) {
            addCriterion("PATIENT_ID like", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotLike(String value) {
            addCriterion("PATIENT_ID not like", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdIn(List<String> values) {
            addCriterion("PATIENT_ID in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotIn(List<String> values) {
            addCriterion("PATIENT_ID not in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdBetween(String value1, String value2) {
            addCriterion("PATIENT_ID between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotBetween(String value1, String value2) {
            addCriterion("PATIENT_ID not between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNull() {
            addCriterion("PATIENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNotNull() {
            addCriterion("PATIENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPatientNameEqualTo(String value) {
            addCriterion("PATIENT_NAME =", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotEqualTo(String value) {
            addCriterion("PATIENT_NAME <>", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThan(String value) {
            addCriterion("PATIENT_NAME >", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThanOrEqualTo(String value) {
            addCriterion("PATIENT_NAME >=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThan(String value) {
            addCriterion("PATIENT_NAME <", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThanOrEqualTo(String value) {
            addCriterion("PATIENT_NAME <=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLike(String value) {
            addCriterion("PATIENT_NAME like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotLike(String value) {
            addCriterion("PATIENT_NAME not like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameIn(List<String> values) {
            addCriterion("PATIENT_NAME in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotIn(List<String> values) {
            addCriterion("PATIENT_NAME not in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameBetween(String value1, String value2) {
            addCriterion("PATIENT_NAME between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotBetween(String value1, String value2) {
            addCriterion("PATIENT_NAME not between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientWeightIsNull() {
            addCriterion("PATIENT_WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andPatientWeightIsNotNull() {
            addCriterion("PATIENT_WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andPatientWeightEqualTo(String value) {
            addCriterion("PATIENT_WEIGHT =", value, "patientWeight");
            return (Criteria) this;
        }

        public Criteria andPatientWeightNotEqualTo(String value) {
            addCriterion("PATIENT_WEIGHT <>", value, "patientWeight");
            return (Criteria) this;
        }

        public Criteria andPatientWeightGreaterThan(String value) {
            addCriterion("PATIENT_WEIGHT >", value, "patientWeight");
            return (Criteria) this;
        }

        public Criteria andPatientWeightGreaterThanOrEqualTo(String value) {
            addCriterion("PATIENT_WEIGHT >=", value, "patientWeight");
            return (Criteria) this;
        }

        public Criteria andPatientWeightLessThan(String value) {
            addCriterion("PATIENT_WEIGHT <", value, "patientWeight");
            return (Criteria) this;
        }

        public Criteria andPatientWeightLessThanOrEqualTo(String value) {
            addCriterion("PATIENT_WEIGHT <=", value, "patientWeight");
            return (Criteria) this;
        }

        public Criteria andPatientWeightLike(String value) {
            addCriterion("PATIENT_WEIGHT like", value, "patientWeight");
            return (Criteria) this;
        }

        public Criteria andPatientWeightNotLike(String value) {
            addCriterion("PATIENT_WEIGHT not like", value, "patientWeight");
            return (Criteria) this;
        }

        public Criteria andPatientWeightIn(List<String> values) {
            addCriterion("PATIENT_WEIGHT in", values, "patientWeight");
            return (Criteria) this;
        }

        public Criteria andPatientWeightNotIn(List<String> values) {
            addCriterion("PATIENT_WEIGHT not in", values, "patientWeight");
            return (Criteria) this;
        }

        public Criteria andPatientWeightBetween(String value1, String value2) {
            addCriterion("PATIENT_WEIGHT between", value1, value2, "patientWeight");
            return (Criteria) this;
        }

        public Criteria andPatientWeightNotBetween(String value1, String value2) {
            addCriterion("PATIENT_WEIGHT not between", value1, value2, "patientWeight");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayIsNull() {
            addCriterion("PATIENT_BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayIsNotNull() {
            addCriterion("PATIENT_BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("PATIENT_BIRTHDAY =", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("PATIENT_BIRTHDAY <>", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("PATIENT_BIRTHDAY >", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PATIENT_BIRTHDAY >=", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("PATIENT_BIRTHDAY <", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PATIENT_BIRTHDAY <=", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("PATIENT_BIRTHDAY in", values, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("PATIENT_BIRTHDAY not in", values, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PATIENT_BIRTHDAY between", value1, value2, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PATIENT_BIRTHDAY not between", value1, value2, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientSexIsNull() {
            addCriterion("PATIENT_SEX is null");
            return (Criteria) this;
        }

        public Criteria andPatientSexIsNotNull() {
            addCriterion("PATIENT_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andPatientSexEqualTo(String value) {
            addCriterion("PATIENT_SEX =", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexNotEqualTo(String value) {
            addCriterion("PATIENT_SEX <>", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexGreaterThan(String value) {
            addCriterion("PATIENT_SEX >", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexGreaterThanOrEqualTo(String value) {
            addCriterion("PATIENT_SEX >=", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexLessThan(String value) {
            addCriterion("PATIENT_SEX <", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexLessThanOrEqualTo(String value) {
            addCriterion("PATIENT_SEX <=", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexLike(String value) {
            addCriterion("PATIENT_SEX like", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexNotLike(String value) {
            addCriterion("PATIENT_SEX not like", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexIn(List<String> values) {
            addCriterion("PATIENT_SEX in", values, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexNotIn(List<String> values) {
            addCriterion("PATIENT_SEX not in", values, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexBetween(String value1, String value2) {
            addCriterion("PATIENT_SEX between", value1, value2, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexNotBetween(String value1, String value2) {
            addCriterion("PATIENT_SEX not between", value1, value2, "patientSex");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusIsNull() {
            addCriterion("MEDICAL_CASE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusIsNotNull() {
            addCriterion("MEDICAL_CASE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusEqualTo(Integer value) {
            addCriterion("MEDICAL_CASE_STATUS =", value, "medicalCaseStatus");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusNotEqualTo(Integer value) {
            addCriterion("MEDICAL_CASE_STATUS <>", value, "medicalCaseStatus");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusGreaterThan(Integer value) {
            addCriterion("MEDICAL_CASE_STATUS >", value, "medicalCaseStatus");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEDICAL_CASE_STATUS >=", value, "medicalCaseStatus");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusLessThan(Integer value) {
            addCriterion("MEDICAL_CASE_STATUS <", value, "medicalCaseStatus");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusLessThanOrEqualTo(Integer value) {
            addCriterion("MEDICAL_CASE_STATUS <=", value, "medicalCaseStatus");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusIn(List<Integer> values) {
            addCriterion("MEDICAL_CASE_STATUS in", values, "medicalCaseStatus");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusNotIn(List<Integer> values) {
            addCriterion("MEDICAL_CASE_STATUS not in", values, "medicalCaseStatus");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusBetween(Integer value1, Integer value2) {
            addCriterion("MEDICAL_CASE_STATUS between", value1, value2, "medicalCaseStatus");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("MEDICAL_CASE_STATUS not between", value1, value2, "medicalCaseStatus");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdIsNull() {
            addCriterion("CREATOR_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdIsNotNull() {
            addCriterion("CREATOR_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdEqualTo(Integer value) {
            addCriterion("CREATOR_USER_ID =", value, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdNotEqualTo(Integer value) {
            addCriterion("CREATOR_USER_ID <>", value, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdGreaterThan(Integer value) {
            addCriterion("CREATOR_USER_ID >", value, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREATOR_USER_ID >=", value, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdLessThan(Integer value) {
            addCriterion("CREATOR_USER_ID <", value, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("CREATOR_USER_ID <=", value, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdIn(List<Integer> values) {
            addCriterion("CREATOR_USER_ID in", values, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdNotIn(List<Integer> values) {
            addCriterion("CREATOR_USER_ID not in", values, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdBetween(Integer value1, Integer value2) {
            addCriterion("CREATOR_USER_ID between", value1, value2, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CREATOR_USER_ID not between", value1, value2, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserNameIsNull() {
            addCriterion("CREATOR_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCreatorUserNameIsNotNull() {
            addCriterion("CREATOR_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorUserNameEqualTo(String value) {
            addCriterion("CREATOR_USER_NAME =", value, "creatorUserName");
            return (Criteria) this;
        }

        public Criteria andCreatorUserNameNotEqualTo(String value) {
            addCriterion("CREATOR_USER_NAME <>", value, "creatorUserName");
            return (Criteria) this;
        }

        public Criteria andCreatorUserNameGreaterThan(String value) {
            addCriterion("CREATOR_USER_NAME >", value, "creatorUserName");
            return (Criteria) this;
        }

        public Criteria andCreatorUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR_USER_NAME >=", value, "creatorUserName");
            return (Criteria) this;
        }

        public Criteria andCreatorUserNameLessThan(String value) {
            addCriterion("CREATOR_USER_NAME <", value, "creatorUserName");
            return (Criteria) this;
        }

        public Criteria andCreatorUserNameLessThanOrEqualTo(String value) {
            addCriterion("CREATOR_USER_NAME <=", value, "creatorUserName");
            return (Criteria) this;
        }

        public Criteria andCreatorUserNameLike(String value) {
            addCriterion("CREATOR_USER_NAME like", value, "creatorUserName");
            return (Criteria) this;
        }

        public Criteria andCreatorUserNameNotLike(String value) {
            addCriterion("CREATOR_USER_NAME not like", value, "creatorUserName");
            return (Criteria) this;
        }

        public Criteria andCreatorUserNameIn(List<String> values) {
            addCriterion("CREATOR_USER_NAME in", values, "creatorUserName");
            return (Criteria) this;
        }

        public Criteria andCreatorUserNameNotIn(List<String> values) {
            addCriterion("CREATOR_USER_NAME not in", values, "creatorUserName");
            return (Criteria) this;
        }

        public Criteria andCreatorUserNameBetween(String value1, String value2) {
            addCriterion("CREATOR_USER_NAME between", value1, value2, "creatorUserName");
            return (Criteria) this;
        }

        public Criteria andCreatorUserNameNotBetween(String value1, String value2) {
            addCriterion("CREATOR_USER_NAME not between", value1, value2, "creatorUserName");
            return (Criteria) this;
        }

        public Criteria andCreatorUserMobileIsNull() {
            addCriterion("CREATOR_USER_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andCreatorUserMobileIsNotNull() {
            addCriterion("CREATOR_USER_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorUserMobileEqualTo(String value) {
            addCriterion("CREATOR_USER_MOBILE =", value, "creatorUserMobile");
            return (Criteria) this;
        }

        public Criteria andCreatorUserMobileNotEqualTo(String value) {
            addCriterion("CREATOR_USER_MOBILE <>", value, "creatorUserMobile");
            return (Criteria) this;
        }

        public Criteria andCreatorUserMobileGreaterThan(String value) {
            addCriterion("CREATOR_USER_MOBILE >", value, "creatorUserMobile");
            return (Criteria) this;
        }

        public Criteria andCreatorUserMobileGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR_USER_MOBILE >=", value, "creatorUserMobile");
            return (Criteria) this;
        }

        public Criteria andCreatorUserMobileLessThan(String value) {
            addCriterion("CREATOR_USER_MOBILE <", value, "creatorUserMobile");
            return (Criteria) this;
        }

        public Criteria andCreatorUserMobileLessThanOrEqualTo(String value) {
            addCriterion("CREATOR_USER_MOBILE <=", value, "creatorUserMobile");
            return (Criteria) this;
        }

        public Criteria andCreatorUserMobileLike(String value) {
            addCriterion("CREATOR_USER_MOBILE like", value, "creatorUserMobile");
            return (Criteria) this;
        }

        public Criteria andCreatorUserMobileNotLike(String value) {
            addCriterion("CREATOR_USER_MOBILE not like", value, "creatorUserMobile");
            return (Criteria) this;
        }

        public Criteria andCreatorUserMobileIn(List<String> values) {
            addCriterion("CREATOR_USER_MOBILE in", values, "creatorUserMobile");
            return (Criteria) this;
        }

        public Criteria andCreatorUserMobileNotIn(List<String> values) {
            addCriterion("CREATOR_USER_MOBILE not in", values, "creatorUserMobile");
            return (Criteria) this;
        }

        public Criteria andCreatorUserMobileBetween(String value1, String value2) {
            addCriterion("CREATOR_USER_MOBILE between", value1, value2, "creatorUserMobile");
            return (Criteria) this;
        }

        public Criteria andCreatorUserMobileNotBetween(String value1, String value2) {
            addCriterion("CREATOR_USER_MOBILE not between", value1, value2, "creatorUserMobile");
            return (Criteria) this;
        }

        public Criteria andCreatorUserEmailIsNull() {
            addCriterion("CREATOR_USER_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andCreatorUserEmailIsNotNull() {
            addCriterion("CREATOR_USER_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorUserEmailEqualTo(String value) {
            addCriterion("CREATOR_USER_EMAIL =", value, "creatorUserEmail");
            return (Criteria) this;
        }

        public Criteria andCreatorUserEmailNotEqualTo(String value) {
            addCriterion("CREATOR_USER_EMAIL <>", value, "creatorUserEmail");
            return (Criteria) this;
        }

        public Criteria andCreatorUserEmailGreaterThan(String value) {
            addCriterion("CREATOR_USER_EMAIL >", value, "creatorUserEmail");
            return (Criteria) this;
        }

        public Criteria andCreatorUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR_USER_EMAIL >=", value, "creatorUserEmail");
            return (Criteria) this;
        }

        public Criteria andCreatorUserEmailLessThan(String value) {
            addCriterion("CREATOR_USER_EMAIL <", value, "creatorUserEmail");
            return (Criteria) this;
        }

        public Criteria andCreatorUserEmailLessThanOrEqualTo(String value) {
            addCriterion("CREATOR_USER_EMAIL <=", value, "creatorUserEmail");
            return (Criteria) this;
        }

        public Criteria andCreatorUserEmailLike(String value) {
            addCriterion("CREATOR_USER_EMAIL like", value, "creatorUserEmail");
            return (Criteria) this;
        }

        public Criteria andCreatorUserEmailNotLike(String value) {
            addCriterion("CREATOR_USER_EMAIL not like", value, "creatorUserEmail");
            return (Criteria) this;
        }

        public Criteria andCreatorUserEmailIn(List<String> values) {
            addCriterion("CREATOR_USER_EMAIL in", values, "creatorUserEmail");
            return (Criteria) this;
        }

        public Criteria andCreatorUserEmailNotIn(List<String> values) {
            addCriterion("CREATOR_USER_EMAIL not in", values, "creatorUserEmail");
            return (Criteria) this;
        }

        public Criteria andCreatorUserEmailBetween(String value1, String value2) {
            addCriterion("CREATOR_USER_EMAIL between", value1, value2, "creatorUserEmail");
            return (Criteria) this;
        }

        public Criteria andCreatorUserEmailNotBetween(String value1, String value2) {
            addCriterion("CREATOR_USER_EMAIL not between", value1, value2, "creatorUserEmail");
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

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("CREATE_TIME like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("CREATE_TIME not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
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

        public Criteria andDiagnoseUserNameIsNull() {
            addCriterion("DIAGNOSE_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserNameIsNotNull() {
            addCriterion("DIAGNOSE_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserNameEqualTo(String value) {
            addCriterion("DIAGNOSE_USER_NAME =", value, "diagnoseUserName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserNameNotEqualTo(String value) {
            addCriterion("DIAGNOSE_USER_NAME <>", value, "diagnoseUserName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserNameGreaterThan(String value) {
            addCriterion("DIAGNOSE_USER_NAME >", value, "diagnoseUserName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("DIAGNOSE_USER_NAME >=", value, "diagnoseUserName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserNameLessThan(String value) {
            addCriterion("DIAGNOSE_USER_NAME <", value, "diagnoseUserName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserNameLessThanOrEqualTo(String value) {
            addCriterion("DIAGNOSE_USER_NAME <=", value, "diagnoseUserName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserNameLike(String value) {
            addCriterion("DIAGNOSE_USER_NAME like", value, "diagnoseUserName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserNameNotLike(String value) {
            addCriterion("DIAGNOSE_USER_NAME not like", value, "diagnoseUserName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserNameIn(List<String> values) {
            addCriterion("DIAGNOSE_USER_NAME in", values, "diagnoseUserName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserNameNotIn(List<String> values) {
            addCriterion("DIAGNOSE_USER_NAME not in", values, "diagnoseUserName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserNameBetween(String value1, String value2) {
            addCriterion("DIAGNOSE_USER_NAME between", value1, value2, "diagnoseUserName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserNameNotBetween(String value1, String value2) {
            addCriterion("DIAGNOSE_USER_NAME not between", value1, value2, "diagnoseUserName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserMobileIsNull() {
            addCriterion("DIAGNOSE_USER_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserMobileIsNotNull() {
            addCriterion("DIAGNOSE_USER_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserMobileEqualTo(String value) {
            addCriterion("DIAGNOSE_USER_MOBILE =", value, "diagnoseUserMobile");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserMobileNotEqualTo(String value) {
            addCriterion("DIAGNOSE_USER_MOBILE <>", value, "diagnoseUserMobile");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserMobileGreaterThan(String value) {
            addCriterion("DIAGNOSE_USER_MOBILE >", value, "diagnoseUserMobile");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserMobileGreaterThanOrEqualTo(String value) {
            addCriterion("DIAGNOSE_USER_MOBILE >=", value, "diagnoseUserMobile");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserMobileLessThan(String value) {
            addCriterion("DIAGNOSE_USER_MOBILE <", value, "diagnoseUserMobile");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserMobileLessThanOrEqualTo(String value) {
            addCriterion("DIAGNOSE_USER_MOBILE <=", value, "diagnoseUserMobile");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserMobileLike(String value) {
            addCriterion("DIAGNOSE_USER_MOBILE like", value, "diagnoseUserMobile");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserMobileNotLike(String value) {
            addCriterion("DIAGNOSE_USER_MOBILE not like", value, "diagnoseUserMobile");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserMobileIn(List<String> values) {
            addCriterion("DIAGNOSE_USER_MOBILE in", values, "diagnoseUserMobile");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserMobileNotIn(List<String> values) {
            addCriterion("DIAGNOSE_USER_MOBILE not in", values, "diagnoseUserMobile");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserMobileBetween(String value1, String value2) {
            addCriterion("DIAGNOSE_USER_MOBILE between", value1, value2, "diagnoseUserMobile");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserMobileNotBetween(String value1, String value2) {
            addCriterion("DIAGNOSE_USER_MOBILE not between", value1, value2, "diagnoseUserMobile");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserEmailIsNull() {
            addCriterion("DIAGNOSE_USER_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserEmailIsNotNull() {
            addCriterion("DIAGNOSE_USER_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserEmailEqualTo(String value) {
            addCriterion("DIAGNOSE_USER_EMAIL =", value, "diagnoseUserEmail");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserEmailNotEqualTo(String value) {
            addCriterion("DIAGNOSE_USER_EMAIL <>", value, "diagnoseUserEmail");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserEmailGreaterThan(String value) {
            addCriterion("DIAGNOSE_USER_EMAIL >", value, "diagnoseUserEmail");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("DIAGNOSE_USER_EMAIL >=", value, "diagnoseUserEmail");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserEmailLessThan(String value) {
            addCriterion("DIAGNOSE_USER_EMAIL <", value, "diagnoseUserEmail");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserEmailLessThanOrEqualTo(String value) {
            addCriterion("DIAGNOSE_USER_EMAIL <=", value, "diagnoseUserEmail");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserEmailLike(String value) {
            addCriterion("DIAGNOSE_USER_EMAIL like", value, "diagnoseUserEmail");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserEmailNotLike(String value) {
            addCriterion("DIAGNOSE_USER_EMAIL not like", value, "diagnoseUserEmail");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserEmailIn(List<String> values) {
            addCriterion("DIAGNOSE_USER_EMAIL in", values, "diagnoseUserEmail");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserEmailNotIn(List<String> values) {
            addCriterion("DIAGNOSE_USER_EMAIL not in", values, "diagnoseUserEmail");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserEmailBetween(String value1, String value2) {
            addCriterion("DIAGNOSE_USER_EMAIL between", value1, value2, "diagnoseUserEmail");
            return (Criteria) this;
        }

        public Criteria andDiagnoseUserEmailNotBetween(String value1, String value2) {
            addCriterion("DIAGNOSE_USER_EMAIL not between", value1, value2, "diagnoseUserEmail");
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

        public Criteria andDiagnoseTimeEqualTo(String value) {
            addCriterion("DIAGNOSE_TIME =", value, "diagnoseTime");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTimeNotEqualTo(String value) {
            addCriterion("DIAGNOSE_TIME <>", value, "diagnoseTime");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTimeGreaterThan(String value) {
            addCriterion("DIAGNOSE_TIME >", value, "diagnoseTime");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTimeGreaterThanOrEqualTo(String value) {
            addCriterion("DIAGNOSE_TIME >=", value, "diagnoseTime");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTimeLessThan(String value) {
            addCriterion("DIAGNOSE_TIME <", value, "diagnoseTime");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTimeLessThanOrEqualTo(String value) {
            addCriterion("DIAGNOSE_TIME <=", value, "diagnoseTime");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTimeLike(String value) {
            addCriterion("DIAGNOSE_TIME like", value, "diagnoseTime");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTimeNotLike(String value) {
            addCriterion("DIAGNOSE_TIME not like", value, "diagnoseTime");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTimeIn(List<String> values) {
            addCriterion("DIAGNOSE_TIME in", values, "diagnoseTime");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTimeNotIn(List<String> values) {
            addCriterion("DIAGNOSE_TIME not in", values, "diagnoseTime");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTimeBetween(String value1, String value2) {
            addCriterion("DIAGNOSE_TIME between", value1, value2, "diagnoseTime");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTimeNotBetween(String value1, String value2) {
            addCriterion("DIAGNOSE_TIME not between", value1, value2, "diagnoseTime");
            return (Criteria) this;
        }

        public Criteria andReviewUserIdIsNull() {
            addCriterion("REVIEW_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andReviewUserIdIsNotNull() {
            addCriterion("REVIEW_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReviewUserIdEqualTo(Integer value) {
            addCriterion("REVIEW_USER_ID =", value, "reviewUserId");
            return (Criteria) this;
        }

        public Criteria andReviewUserIdNotEqualTo(Integer value) {
            addCriterion("REVIEW_USER_ID <>", value, "reviewUserId");
            return (Criteria) this;
        }

        public Criteria andReviewUserIdGreaterThan(Integer value) {
            addCriterion("REVIEW_USER_ID >", value, "reviewUserId");
            return (Criteria) this;
        }

        public Criteria andReviewUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("REVIEW_USER_ID >=", value, "reviewUserId");
            return (Criteria) this;
        }

        public Criteria andReviewUserIdLessThan(Integer value) {
            addCriterion("REVIEW_USER_ID <", value, "reviewUserId");
            return (Criteria) this;
        }

        public Criteria andReviewUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("REVIEW_USER_ID <=", value, "reviewUserId");
            return (Criteria) this;
        }

        public Criteria andReviewUserIdIn(List<Integer> values) {
            addCriterion("REVIEW_USER_ID in", values, "reviewUserId");
            return (Criteria) this;
        }

        public Criteria andReviewUserIdNotIn(List<Integer> values) {
            addCriterion("REVIEW_USER_ID not in", values, "reviewUserId");
            return (Criteria) this;
        }

        public Criteria andReviewUserIdBetween(Integer value1, Integer value2) {
            addCriterion("REVIEW_USER_ID between", value1, value2, "reviewUserId");
            return (Criteria) this;
        }

        public Criteria andReviewUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("REVIEW_USER_ID not between", value1, value2, "reviewUserId");
            return (Criteria) this;
        }

        public Criteria andReviewUserNameIsNull() {
            addCriterion("REVIEW_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andReviewUserNameIsNotNull() {
            addCriterion("REVIEW_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andReviewUserNameEqualTo(String value) {
            addCriterion("REVIEW_USER_NAME =", value, "reviewUserName");
            return (Criteria) this;
        }

        public Criteria andReviewUserNameNotEqualTo(String value) {
            addCriterion("REVIEW_USER_NAME <>", value, "reviewUserName");
            return (Criteria) this;
        }

        public Criteria andReviewUserNameGreaterThan(String value) {
            addCriterion("REVIEW_USER_NAME >", value, "reviewUserName");
            return (Criteria) this;
        }

        public Criteria andReviewUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEW_USER_NAME >=", value, "reviewUserName");
            return (Criteria) this;
        }

        public Criteria andReviewUserNameLessThan(String value) {
            addCriterion("REVIEW_USER_NAME <", value, "reviewUserName");
            return (Criteria) this;
        }

        public Criteria andReviewUserNameLessThanOrEqualTo(String value) {
            addCriterion("REVIEW_USER_NAME <=", value, "reviewUserName");
            return (Criteria) this;
        }

        public Criteria andReviewUserNameLike(String value) {
            addCriterion("REVIEW_USER_NAME like", value, "reviewUserName");
            return (Criteria) this;
        }

        public Criteria andReviewUserNameNotLike(String value) {
            addCriterion("REVIEW_USER_NAME not like", value, "reviewUserName");
            return (Criteria) this;
        }

        public Criteria andReviewUserNameIn(List<String> values) {
            addCriterion("REVIEW_USER_NAME in", values, "reviewUserName");
            return (Criteria) this;
        }

        public Criteria andReviewUserNameNotIn(List<String> values) {
            addCriterion("REVIEW_USER_NAME not in", values, "reviewUserName");
            return (Criteria) this;
        }

        public Criteria andReviewUserNameBetween(String value1, String value2) {
            addCriterion("REVIEW_USER_NAME between", value1, value2, "reviewUserName");
            return (Criteria) this;
        }

        public Criteria andReviewUserNameNotBetween(String value1, String value2) {
            addCriterion("REVIEW_USER_NAME not between", value1, value2, "reviewUserName");
            return (Criteria) this;
        }

        public Criteria andReviewUserMobileIsNull() {
            addCriterion("REVIEW_USER_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andReviewUserMobileIsNotNull() {
            addCriterion("REVIEW_USER_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andReviewUserMobileEqualTo(String value) {
            addCriterion("REVIEW_USER_MOBILE =", value, "reviewUserMobile");
            return (Criteria) this;
        }

        public Criteria andReviewUserMobileNotEqualTo(String value) {
            addCriterion("REVIEW_USER_MOBILE <>", value, "reviewUserMobile");
            return (Criteria) this;
        }

        public Criteria andReviewUserMobileGreaterThan(String value) {
            addCriterion("REVIEW_USER_MOBILE >", value, "reviewUserMobile");
            return (Criteria) this;
        }

        public Criteria andReviewUserMobileGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEW_USER_MOBILE >=", value, "reviewUserMobile");
            return (Criteria) this;
        }

        public Criteria andReviewUserMobileLessThan(String value) {
            addCriterion("REVIEW_USER_MOBILE <", value, "reviewUserMobile");
            return (Criteria) this;
        }

        public Criteria andReviewUserMobileLessThanOrEqualTo(String value) {
            addCriterion("REVIEW_USER_MOBILE <=", value, "reviewUserMobile");
            return (Criteria) this;
        }

        public Criteria andReviewUserMobileLike(String value) {
            addCriterion("REVIEW_USER_MOBILE like", value, "reviewUserMobile");
            return (Criteria) this;
        }

        public Criteria andReviewUserMobileNotLike(String value) {
            addCriterion("REVIEW_USER_MOBILE not like", value, "reviewUserMobile");
            return (Criteria) this;
        }

        public Criteria andReviewUserMobileIn(List<String> values) {
            addCriterion("REVIEW_USER_MOBILE in", values, "reviewUserMobile");
            return (Criteria) this;
        }

        public Criteria andReviewUserMobileNotIn(List<String> values) {
            addCriterion("REVIEW_USER_MOBILE not in", values, "reviewUserMobile");
            return (Criteria) this;
        }

        public Criteria andReviewUserMobileBetween(String value1, String value2) {
            addCriterion("REVIEW_USER_MOBILE between", value1, value2, "reviewUserMobile");
            return (Criteria) this;
        }

        public Criteria andReviewUserMobileNotBetween(String value1, String value2) {
            addCriterion("REVIEW_USER_MOBILE not between", value1, value2, "reviewUserMobile");
            return (Criteria) this;
        }

        public Criteria andReviewUserEmailIsNull() {
            addCriterion("REVIEW_USER_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andReviewUserEmailIsNotNull() {
            addCriterion("REVIEW_USER_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andReviewUserEmailEqualTo(String value) {
            addCriterion("REVIEW_USER_EMAIL =", value, "reviewUserEmail");
            return (Criteria) this;
        }

        public Criteria andReviewUserEmailNotEqualTo(String value) {
            addCriterion("REVIEW_USER_EMAIL <>", value, "reviewUserEmail");
            return (Criteria) this;
        }

        public Criteria andReviewUserEmailGreaterThan(String value) {
            addCriterion("REVIEW_USER_EMAIL >", value, "reviewUserEmail");
            return (Criteria) this;
        }

        public Criteria andReviewUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEW_USER_EMAIL >=", value, "reviewUserEmail");
            return (Criteria) this;
        }

        public Criteria andReviewUserEmailLessThan(String value) {
            addCriterion("REVIEW_USER_EMAIL <", value, "reviewUserEmail");
            return (Criteria) this;
        }

        public Criteria andReviewUserEmailLessThanOrEqualTo(String value) {
            addCriterion("REVIEW_USER_EMAIL <=", value, "reviewUserEmail");
            return (Criteria) this;
        }

        public Criteria andReviewUserEmailLike(String value) {
            addCriterion("REVIEW_USER_EMAIL like", value, "reviewUserEmail");
            return (Criteria) this;
        }

        public Criteria andReviewUserEmailNotLike(String value) {
            addCriterion("REVIEW_USER_EMAIL not like", value, "reviewUserEmail");
            return (Criteria) this;
        }

        public Criteria andReviewUserEmailIn(List<String> values) {
            addCriterion("REVIEW_USER_EMAIL in", values, "reviewUserEmail");
            return (Criteria) this;
        }

        public Criteria andReviewUserEmailNotIn(List<String> values) {
            addCriterion("REVIEW_USER_EMAIL not in", values, "reviewUserEmail");
            return (Criteria) this;
        }

        public Criteria andReviewUserEmailBetween(String value1, String value2) {
            addCriterion("REVIEW_USER_EMAIL between", value1, value2, "reviewUserEmail");
            return (Criteria) this;
        }

        public Criteria andReviewUserEmailNotBetween(String value1, String value2) {
            addCriterion("REVIEW_USER_EMAIL not between", value1, value2, "reviewUserEmail");
            return (Criteria) this;
        }

        public Criteria andReviewImagePerformanceIsNull() {
            addCriterion("REVIEW_IMAGE_PERFORMANCE is null");
            return (Criteria) this;
        }

        public Criteria andReviewImagePerformanceIsNotNull() {
            addCriterion("REVIEW_IMAGE_PERFORMANCE is not null");
            return (Criteria) this;
        }

        public Criteria andReviewImagePerformanceEqualTo(String value) {
            addCriterion("REVIEW_IMAGE_PERFORMANCE =", value, "reviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andReviewImagePerformanceNotEqualTo(String value) {
            addCriterion("REVIEW_IMAGE_PERFORMANCE <>", value, "reviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andReviewImagePerformanceGreaterThan(String value) {
            addCriterion("REVIEW_IMAGE_PERFORMANCE >", value, "reviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andReviewImagePerformanceGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEW_IMAGE_PERFORMANCE >=", value, "reviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andReviewImagePerformanceLessThan(String value) {
            addCriterion("REVIEW_IMAGE_PERFORMANCE <", value, "reviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andReviewImagePerformanceLessThanOrEqualTo(String value) {
            addCriterion("REVIEW_IMAGE_PERFORMANCE <=", value, "reviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andReviewImagePerformanceLike(String value) {
            addCriterion("REVIEW_IMAGE_PERFORMANCE like", value, "reviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andReviewImagePerformanceNotLike(String value) {
            addCriterion("REVIEW_IMAGE_PERFORMANCE not like", value, "reviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andReviewImagePerformanceIn(List<String> values) {
            addCriterion("REVIEW_IMAGE_PERFORMANCE in", values, "reviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andReviewImagePerformanceNotIn(List<String> values) {
            addCriterion("REVIEW_IMAGE_PERFORMANCE not in", values, "reviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andReviewImagePerformanceBetween(String value1, String value2) {
            addCriterion("REVIEW_IMAGE_PERFORMANCE between", value1, value2, "reviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andReviewImagePerformanceNotBetween(String value1, String value2) {
            addCriterion("REVIEW_IMAGE_PERFORMANCE not between", value1, value2, "reviewImagePerformance");
            return (Criteria) this;
        }

        public Criteria andReviewImageResultIsNull() {
            addCriterion("REVIEW_IMAGE_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andReviewImageResultIsNotNull() {
            addCriterion("REVIEW_IMAGE_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andReviewImageResultEqualTo(String value) {
            addCriterion("REVIEW_IMAGE_RESULT =", value, "reviewImageResult");
            return (Criteria) this;
        }

        public Criteria andReviewImageResultNotEqualTo(String value) {
            addCriterion("REVIEW_IMAGE_RESULT <>", value, "reviewImageResult");
            return (Criteria) this;
        }

        public Criteria andReviewImageResultGreaterThan(String value) {
            addCriterion("REVIEW_IMAGE_RESULT >", value, "reviewImageResult");
            return (Criteria) this;
        }

        public Criteria andReviewImageResultGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEW_IMAGE_RESULT >=", value, "reviewImageResult");
            return (Criteria) this;
        }

        public Criteria andReviewImageResultLessThan(String value) {
            addCriterion("REVIEW_IMAGE_RESULT <", value, "reviewImageResult");
            return (Criteria) this;
        }

        public Criteria andReviewImageResultLessThanOrEqualTo(String value) {
            addCriterion("REVIEW_IMAGE_RESULT <=", value, "reviewImageResult");
            return (Criteria) this;
        }

        public Criteria andReviewImageResultLike(String value) {
            addCriterion("REVIEW_IMAGE_RESULT like", value, "reviewImageResult");
            return (Criteria) this;
        }

        public Criteria andReviewImageResultNotLike(String value) {
            addCriterion("REVIEW_IMAGE_RESULT not like", value, "reviewImageResult");
            return (Criteria) this;
        }

        public Criteria andReviewImageResultIn(List<String> values) {
            addCriterion("REVIEW_IMAGE_RESULT in", values, "reviewImageResult");
            return (Criteria) this;
        }

        public Criteria andReviewImageResultNotIn(List<String> values) {
            addCriterion("REVIEW_IMAGE_RESULT not in", values, "reviewImageResult");
            return (Criteria) this;
        }

        public Criteria andReviewImageResultBetween(String value1, String value2) {
            addCriterion("REVIEW_IMAGE_RESULT between", value1, value2, "reviewImageResult");
            return (Criteria) this;
        }

        public Criteria andReviewImageResultNotBetween(String value1, String value2) {
            addCriterion("REVIEW_IMAGE_RESULT not between", value1, value2, "reviewImageResult");
            return (Criteria) this;
        }

        public Criteria andReviewTimeIsNull() {
            addCriterion("REVIEW_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReviewTimeIsNotNull() {
            addCriterion("REVIEW_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReviewTimeEqualTo(String value) {
            addCriterion("REVIEW_TIME =", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotEqualTo(String value) {
            addCriterion("REVIEW_TIME <>", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeGreaterThan(String value) {
            addCriterion("REVIEW_TIME >", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEW_TIME >=", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeLessThan(String value) {
            addCriterion("REVIEW_TIME <", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeLessThanOrEqualTo(String value) {
            addCriterion("REVIEW_TIME <=", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeLike(String value) {
            addCriterion("REVIEW_TIME like", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotLike(String value) {
            addCriterion("REVIEW_TIME not like", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeIn(List<String> values) {
            addCriterion("REVIEW_TIME in", values, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotIn(List<String> values) {
            addCriterion("REVIEW_TIME not in", values, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeBetween(String value1, String value2) {
            addCriterion("REVIEW_TIME between", value1, value2, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotBetween(String value1, String value2) {
            addCriterion("REVIEW_TIME not between", value1, value2, "reviewTime");
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

        public Criteria andStudyStatusIsNull() {
            addCriterion("STUDY_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStudyStatusIsNotNull() {
            addCriterion("STUDY_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStudyStatusEqualTo(String value) {
            addCriterion("STUDY_STATUS =", value, "studyStatus");
            return (Criteria) this;
        }

        public Criteria andStudyStatusNotEqualTo(String value) {
            addCriterion("STUDY_STATUS <>", value, "studyStatus");
            return (Criteria) this;
        }

        public Criteria andStudyStatusGreaterThan(String value) {
            addCriterion("STUDY_STATUS >", value, "studyStatus");
            return (Criteria) this;
        }

        public Criteria andStudyStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STUDY_STATUS >=", value, "studyStatus");
            return (Criteria) this;
        }

        public Criteria andStudyStatusLessThan(String value) {
            addCriterion("STUDY_STATUS <", value, "studyStatus");
            return (Criteria) this;
        }

        public Criteria andStudyStatusLessThanOrEqualTo(String value) {
            addCriterion("STUDY_STATUS <=", value, "studyStatus");
            return (Criteria) this;
        }

        public Criteria andStudyStatusLike(String value) {
            addCriterion("STUDY_STATUS like", value, "studyStatus");
            return (Criteria) this;
        }

        public Criteria andStudyStatusNotLike(String value) {
            addCriterion("STUDY_STATUS not like", value, "studyStatus");
            return (Criteria) this;
        }

        public Criteria andStudyStatusIn(List<String> values) {
            addCriterion("STUDY_STATUS in", values, "studyStatus");
            return (Criteria) this;
        }

        public Criteria andStudyStatusNotIn(List<String> values) {
            addCriterion("STUDY_STATUS not in", values, "studyStatus");
            return (Criteria) this;
        }

        public Criteria andStudyStatusBetween(String value1, String value2) {
            addCriterion("STUDY_STATUS between", value1, value2, "studyStatus");
            return (Criteria) this;
        }

        public Criteria andStudyStatusNotBetween(String value1, String value2) {
            addCriterion("STUDY_STATUS not between", value1, value2, "studyStatus");
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