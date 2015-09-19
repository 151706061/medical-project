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

        public Criteria andStydyDescriptionIsNull() {
            addCriterion("STYDY_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andStydyDescriptionIsNotNull() {
            addCriterion("STYDY_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andStydyDescriptionEqualTo(String value) {
            addCriterion("STYDY_DESCRIPTION =", value, "stydyDescription");
            return (Criteria) this;
        }

        public Criteria andStydyDescriptionNotEqualTo(String value) {
            addCriterion("STYDY_DESCRIPTION <>", value, "stydyDescription");
            return (Criteria) this;
        }

        public Criteria andStydyDescriptionGreaterThan(String value) {
            addCriterion("STYDY_DESCRIPTION >", value, "stydyDescription");
            return (Criteria) this;
        }

        public Criteria andStydyDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("STYDY_DESCRIPTION >=", value, "stydyDescription");
            return (Criteria) this;
        }

        public Criteria andStydyDescriptionLessThan(String value) {
            addCriterion("STYDY_DESCRIPTION <", value, "stydyDescription");
            return (Criteria) this;
        }

        public Criteria andStydyDescriptionLessThanOrEqualTo(String value) {
            addCriterion("STYDY_DESCRIPTION <=", value, "stydyDescription");
            return (Criteria) this;
        }

        public Criteria andStydyDescriptionLike(String value) {
            addCriterion("STYDY_DESCRIPTION like", value, "stydyDescription");
            return (Criteria) this;
        }

        public Criteria andStydyDescriptionNotLike(String value) {
            addCriterion("STYDY_DESCRIPTION not like", value, "stydyDescription");
            return (Criteria) this;
        }

        public Criteria andStydyDescriptionIn(List<String> values) {
            addCriterion("STYDY_DESCRIPTION in", values, "stydyDescription");
            return (Criteria) this;
        }

        public Criteria andStydyDescriptionNotIn(List<String> values) {
            addCriterion("STYDY_DESCRIPTION not in", values, "stydyDescription");
            return (Criteria) this;
        }

        public Criteria andStydyDescriptionBetween(String value1, String value2) {
            addCriterion("STYDY_DESCRIPTION between", value1, value2, "stydyDescription");
            return (Criteria) this;
        }

        public Criteria andStydyDescriptionNotBetween(String value1, String value2) {
            addCriterion("STYDY_DESCRIPTION not between", value1, value2, "stydyDescription");
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