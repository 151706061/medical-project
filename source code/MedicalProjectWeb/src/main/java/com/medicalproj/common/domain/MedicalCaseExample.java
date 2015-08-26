package com.medicalproj.common.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MedicalCaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedicalCaseExample() {
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

        public Criteria andReviewTimeEqualTo(Date value) {
            addCriterion("REVIEW_TIME =", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotEqualTo(Date value) {
            addCriterion("REVIEW_TIME <>", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeGreaterThan(Date value) {
            addCriterion("REVIEW_TIME >", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REVIEW_TIME >=", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeLessThan(Date value) {
            addCriterion("REVIEW_TIME <", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeLessThanOrEqualTo(Date value) {
            addCriterion("REVIEW_TIME <=", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeIn(List<Date> values) {
            addCriterion("REVIEW_TIME in", values, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotIn(List<Date> values) {
            addCriterion("REVIEW_TIME not in", values, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeBetween(Date value1, Date value2) {
            addCriterion("REVIEW_TIME between", value1, value2, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotBetween(Date value1, Date value2) {
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