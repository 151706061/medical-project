package com.medicalproj.common.domain;

import java.util.ArrayList;
import java.util.List;

public class StudyViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudyViewExample() {
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

        public Criteria andStudyDateEqualTo(String value) {
            addCriterion("STUDY_DATE =", value, "studyDate");
            return (Criteria) this;
        }

        public Criteria andStudyDateNotEqualTo(String value) {
            addCriterion("STUDY_DATE <>", value, "studyDate");
            return (Criteria) this;
        }

        public Criteria andStudyDateGreaterThan(String value) {
            addCriterion("STUDY_DATE >", value, "studyDate");
            return (Criteria) this;
        }

        public Criteria andStudyDateGreaterThanOrEqualTo(String value) {
            addCriterion("STUDY_DATE >=", value, "studyDate");
            return (Criteria) this;
        }

        public Criteria andStudyDateLessThan(String value) {
            addCriterion("STUDY_DATE <", value, "studyDate");
            return (Criteria) this;
        }

        public Criteria andStudyDateLessThanOrEqualTo(String value) {
            addCriterion("STUDY_DATE <=", value, "studyDate");
            return (Criteria) this;
        }

        public Criteria andStudyDateLike(String value) {
            addCriterion("STUDY_DATE like", value, "studyDate");
            return (Criteria) this;
        }

        public Criteria andStudyDateNotLike(String value) {
            addCriterion("STUDY_DATE not like", value, "studyDate");
            return (Criteria) this;
        }

        public Criteria andStudyDateIn(List<String> values) {
            addCriterion("STUDY_DATE in", values, "studyDate");
            return (Criteria) this;
        }

        public Criteria andStudyDateNotIn(List<String> values) {
            addCriterion("STUDY_DATE not in", values, "studyDate");
            return (Criteria) this;
        }

        public Criteria andStudyDateBetween(String value1, String value2) {
            addCriterion("STUDY_DATE between", value1, value2, "studyDate");
            return (Criteria) this;
        }

        public Criteria andStudyDateNotBetween(String value1, String value2) {
            addCriterion("STUDY_DATE not between", value1, value2, "studyDate");
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

        public Criteria andFirstReviewUserNameIsNull() {
            addCriterion("FIRST_REVIEW_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFirstReviewUserNameIsNotNull() {
            addCriterion("FIRST_REVIEW_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFirstReviewUserNameEqualTo(String value) {
            addCriterion("FIRST_REVIEW_USER_NAME =", value, "firstReviewUserName");
            return (Criteria) this;
        }

        public Criteria andFirstReviewUserNameNotEqualTo(String value) {
            addCriterion("FIRST_REVIEW_USER_NAME <>", value, "firstReviewUserName");
            return (Criteria) this;
        }

        public Criteria andFirstReviewUserNameGreaterThan(String value) {
            addCriterion("FIRST_REVIEW_USER_NAME >", value, "firstReviewUserName");
            return (Criteria) this;
        }

        public Criteria andFirstReviewUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("FIRST_REVIEW_USER_NAME >=", value, "firstReviewUserName");
            return (Criteria) this;
        }

        public Criteria andFirstReviewUserNameLessThan(String value) {
            addCriterion("FIRST_REVIEW_USER_NAME <", value, "firstReviewUserName");
            return (Criteria) this;
        }

        public Criteria andFirstReviewUserNameLessThanOrEqualTo(String value) {
            addCriterion("FIRST_REVIEW_USER_NAME <=", value, "firstReviewUserName");
            return (Criteria) this;
        }

        public Criteria andFirstReviewUserNameLike(String value) {
            addCriterion("FIRST_REVIEW_USER_NAME like", value, "firstReviewUserName");
            return (Criteria) this;
        }

        public Criteria andFirstReviewUserNameNotLike(String value) {
            addCriterion("FIRST_REVIEW_USER_NAME not like", value, "firstReviewUserName");
            return (Criteria) this;
        }

        public Criteria andFirstReviewUserNameIn(List<String> values) {
            addCriterion("FIRST_REVIEW_USER_NAME in", values, "firstReviewUserName");
            return (Criteria) this;
        }

        public Criteria andFirstReviewUserNameNotIn(List<String> values) {
            addCriterion("FIRST_REVIEW_USER_NAME not in", values, "firstReviewUserName");
            return (Criteria) this;
        }

        public Criteria andFirstReviewUserNameBetween(String value1, String value2) {
            addCriterion("FIRST_REVIEW_USER_NAME between", value1, value2, "firstReviewUserName");
            return (Criteria) this;
        }

        public Criteria andFirstReviewUserNameNotBetween(String value1, String value2) {
            addCriterion("FIRST_REVIEW_USER_NAME not between", value1, value2, "firstReviewUserName");
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

        public Criteria andFirstReviewTimeEqualTo(String value) {
            addCriterion("FIRST_REVIEW_TIME =", value, "firstReviewTime");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeNotEqualTo(String value) {
            addCriterion("FIRST_REVIEW_TIME <>", value, "firstReviewTime");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeGreaterThan(String value) {
            addCriterion("FIRST_REVIEW_TIME >", value, "firstReviewTime");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeGreaterThanOrEqualTo(String value) {
            addCriterion("FIRST_REVIEW_TIME >=", value, "firstReviewTime");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeLessThan(String value) {
            addCriterion("FIRST_REVIEW_TIME <", value, "firstReviewTime");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeLessThanOrEqualTo(String value) {
            addCriterion("FIRST_REVIEW_TIME <=", value, "firstReviewTime");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeLike(String value) {
            addCriterion("FIRST_REVIEW_TIME like", value, "firstReviewTime");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeNotLike(String value) {
            addCriterion("FIRST_REVIEW_TIME not like", value, "firstReviewTime");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeIn(List<String> values) {
            addCriterion("FIRST_REVIEW_TIME in", values, "firstReviewTime");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeNotIn(List<String> values) {
            addCriterion("FIRST_REVIEW_TIME not in", values, "firstReviewTime");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeBetween(String value1, String value2) {
            addCriterion("FIRST_REVIEW_TIME between", value1, value2, "firstReviewTime");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeNotBetween(String value1, String value2) {
            addCriterion("FIRST_REVIEW_TIME not between", value1, value2, "firstReviewTime");
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

        public Criteria andFinalReviewUserNameIsNull() {
            addCriterion("FINAL_REVIEW_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFinalReviewUserNameIsNotNull() {
            addCriterion("FINAL_REVIEW_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFinalReviewUserNameEqualTo(String value) {
            addCriterion("FINAL_REVIEW_USER_NAME =", value, "finalReviewUserName");
            return (Criteria) this;
        }

        public Criteria andFinalReviewUserNameNotEqualTo(String value) {
            addCriterion("FINAL_REVIEW_USER_NAME <>", value, "finalReviewUserName");
            return (Criteria) this;
        }

        public Criteria andFinalReviewUserNameGreaterThan(String value) {
            addCriterion("FINAL_REVIEW_USER_NAME >", value, "finalReviewUserName");
            return (Criteria) this;
        }

        public Criteria andFinalReviewUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("FINAL_REVIEW_USER_NAME >=", value, "finalReviewUserName");
            return (Criteria) this;
        }

        public Criteria andFinalReviewUserNameLessThan(String value) {
            addCriterion("FINAL_REVIEW_USER_NAME <", value, "finalReviewUserName");
            return (Criteria) this;
        }

        public Criteria andFinalReviewUserNameLessThanOrEqualTo(String value) {
            addCriterion("FINAL_REVIEW_USER_NAME <=", value, "finalReviewUserName");
            return (Criteria) this;
        }

        public Criteria andFinalReviewUserNameLike(String value) {
            addCriterion("FINAL_REVIEW_USER_NAME like", value, "finalReviewUserName");
            return (Criteria) this;
        }

        public Criteria andFinalReviewUserNameNotLike(String value) {
            addCriterion("FINAL_REVIEW_USER_NAME not like", value, "finalReviewUserName");
            return (Criteria) this;
        }

        public Criteria andFinalReviewUserNameIn(List<String> values) {
            addCriterion("FINAL_REVIEW_USER_NAME in", values, "finalReviewUserName");
            return (Criteria) this;
        }

        public Criteria andFinalReviewUserNameNotIn(List<String> values) {
            addCriterion("FINAL_REVIEW_USER_NAME not in", values, "finalReviewUserName");
            return (Criteria) this;
        }

        public Criteria andFinalReviewUserNameBetween(String value1, String value2) {
            addCriterion("FINAL_REVIEW_USER_NAME between", value1, value2, "finalReviewUserName");
            return (Criteria) this;
        }

        public Criteria andFinalReviewUserNameNotBetween(String value1, String value2) {
            addCriterion("FINAL_REVIEW_USER_NAME not between", value1, value2, "finalReviewUserName");
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

        public Criteria andFinalReviewTimeEqualTo(String value) {
            addCriterion("FINAL_REVIEW_TIME =", value, "finalReviewTime");
            return (Criteria) this;
        }

        public Criteria andFinalReviewTimeNotEqualTo(String value) {
            addCriterion("FINAL_REVIEW_TIME <>", value, "finalReviewTime");
            return (Criteria) this;
        }

        public Criteria andFinalReviewTimeGreaterThan(String value) {
            addCriterion("FINAL_REVIEW_TIME >", value, "finalReviewTime");
            return (Criteria) this;
        }

        public Criteria andFinalReviewTimeGreaterThanOrEqualTo(String value) {
            addCriterion("FINAL_REVIEW_TIME >=", value, "finalReviewTime");
            return (Criteria) this;
        }

        public Criteria andFinalReviewTimeLessThan(String value) {
            addCriterion("FINAL_REVIEW_TIME <", value, "finalReviewTime");
            return (Criteria) this;
        }

        public Criteria andFinalReviewTimeLessThanOrEqualTo(String value) {
            addCriterion("FINAL_REVIEW_TIME <=", value, "finalReviewTime");
            return (Criteria) this;
        }

        public Criteria andFinalReviewTimeLike(String value) {
            addCriterion("FINAL_REVIEW_TIME like", value, "finalReviewTime");
            return (Criteria) this;
        }

        public Criteria andFinalReviewTimeNotLike(String value) {
            addCriterion("FINAL_REVIEW_TIME not like", value, "finalReviewTime");
            return (Criteria) this;
        }

        public Criteria andFinalReviewTimeIn(List<String> values) {
            addCriterion("FINAL_REVIEW_TIME in", values, "finalReviewTime");
            return (Criteria) this;
        }

        public Criteria andFinalReviewTimeNotIn(List<String> values) {
            addCriterion("FINAL_REVIEW_TIME not in", values, "finalReviewTime");
            return (Criteria) this;
        }

        public Criteria andFinalReviewTimeBetween(String value1, String value2) {
            addCriterion("FINAL_REVIEW_TIME between", value1, value2, "finalReviewTime");
            return (Criteria) this;
        }

        public Criteria andFinalReviewTimeNotBetween(String value1, String value2) {
            addCriterion("FINAL_REVIEW_TIME not between", value1, value2, "finalReviewTime");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
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