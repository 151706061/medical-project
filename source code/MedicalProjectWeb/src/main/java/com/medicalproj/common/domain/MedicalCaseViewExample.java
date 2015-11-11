package com.medicalproj.common.domain;

import java.util.ArrayList;
import java.util.List;

public class MedicalCaseViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedicalCaseViewExample() {
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

        public Criteria andPatientBirthdayIsNull() {
            addCriterion("PATIENT_BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayIsNotNull() {
            addCriterion("PATIENT_BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayEqualTo(String value) {
            addCriterion("PATIENT_BIRTHDAY =", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayNotEqualTo(String value) {
            addCriterion("PATIENT_BIRTHDAY <>", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayGreaterThan(String value) {
            addCriterion("PATIENT_BIRTHDAY >", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("PATIENT_BIRTHDAY >=", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayLessThan(String value) {
            addCriterion("PATIENT_BIRTHDAY <", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayLessThanOrEqualTo(String value) {
            addCriterion("PATIENT_BIRTHDAY <=", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayLike(String value) {
            addCriterion("PATIENT_BIRTHDAY like", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayNotLike(String value) {
            addCriterion("PATIENT_BIRTHDAY not like", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayIn(List<String> values) {
            addCriterion("PATIENT_BIRTHDAY in", values, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayNotIn(List<String> values) {
            addCriterion("PATIENT_BIRTHDAY not in", values, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayBetween(String value1, String value2) {
            addCriterion("PATIENT_BIRTHDAY between", value1, value2, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayNotBetween(String value1, String value2) {
            addCriterion("PATIENT_BIRTHDAY not between", value1, value2, "patientBirthday");
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

        public Criteria andMedicalCaseStatusEqualTo(String value) {
            addCriterion("MEDICAL_CASE_STATUS =", value, "medicalCaseStatus");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusNotEqualTo(String value) {
            addCriterion("MEDICAL_CASE_STATUS <>", value, "medicalCaseStatus");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusGreaterThan(String value) {
            addCriterion("MEDICAL_CASE_STATUS >", value, "medicalCaseStatus");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusGreaterThanOrEqualTo(String value) {
            addCriterion("MEDICAL_CASE_STATUS >=", value, "medicalCaseStatus");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusLessThan(String value) {
            addCriterion("MEDICAL_CASE_STATUS <", value, "medicalCaseStatus");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusLessThanOrEqualTo(String value) {
            addCriterion("MEDICAL_CASE_STATUS <=", value, "medicalCaseStatus");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusLike(String value) {
            addCriterion("MEDICAL_CASE_STATUS like", value, "medicalCaseStatus");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusNotLike(String value) {
            addCriterion("MEDICAL_CASE_STATUS not like", value, "medicalCaseStatus");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusIn(List<String> values) {
            addCriterion("MEDICAL_CASE_STATUS in", values, "medicalCaseStatus");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusNotIn(List<String> values) {
            addCriterion("MEDICAL_CASE_STATUS not in", values, "medicalCaseStatus");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusBetween(String value1, String value2) {
            addCriterion("MEDICAL_CASE_STATUS between", value1, value2, "medicalCaseStatus");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusNotBetween(String value1, String value2) {
            addCriterion("MEDICAL_CASE_STATUS not between", value1, value2, "medicalCaseStatus");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusCodeIsNull() {
            addCriterion("MEDICAL_CASE_STATUS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusCodeIsNotNull() {
            addCriterion("MEDICAL_CASE_STATUS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusCodeEqualTo(Integer value) {
            addCriterion("MEDICAL_CASE_STATUS_CODE =", value, "medicalCaseStatusCode");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusCodeNotEqualTo(Integer value) {
            addCriterion("MEDICAL_CASE_STATUS_CODE <>", value, "medicalCaseStatusCode");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusCodeGreaterThan(Integer value) {
            addCriterion("MEDICAL_CASE_STATUS_CODE >", value, "medicalCaseStatusCode");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEDICAL_CASE_STATUS_CODE >=", value, "medicalCaseStatusCode");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusCodeLessThan(Integer value) {
            addCriterion("MEDICAL_CASE_STATUS_CODE <", value, "medicalCaseStatusCode");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusCodeLessThanOrEqualTo(Integer value) {
            addCriterion("MEDICAL_CASE_STATUS_CODE <=", value, "medicalCaseStatusCode");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusCodeIn(List<Integer> values) {
            addCriterion("MEDICAL_CASE_STATUS_CODE in", values, "medicalCaseStatusCode");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusCodeNotIn(List<Integer> values) {
            addCriterion("MEDICAL_CASE_STATUS_CODE not in", values, "medicalCaseStatusCode");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusCodeBetween(Integer value1, Integer value2) {
            addCriterion("MEDICAL_CASE_STATUS_CODE between", value1, value2, "medicalCaseStatusCode");
            return (Criteria) this;
        }

        public Criteria andMedicalCaseStatusCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("MEDICAL_CASE_STATUS_CODE not between", value1, value2, "medicalCaseStatusCode");
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