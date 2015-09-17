package com.medicalproj.common.domain;

import java.util.ArrayList;
import java.util.List;

public class AuthorizeUserViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthorizeUserViewExample() {
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

        public Criteria andApplyUserIdIsNull() {
            addCriterion("APPLY_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdIsNotNull() {
            addCriterion("APPLY_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdEqualTo(Integer value) {
            addCriterion("APPLY_USER_ID =", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdNotEqualTo(Integer value) {
            addCriterion("APPLY_USER_ID <>", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdGreaterThan(Integer value) {
            addCriterion("APPLY_USER_ID >", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("APPLY_USER_ID >=", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdLessThan(Integer value) {
            addCriterion("APPLY_USER_ID <", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("APPLY_USER_ID <=", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdIn(List<Integer> values) {
            addCriterion("APPLY_USER_ID in", values, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdNotIn(List<Integer> values) {
            addCriterion("APPLY_USER_ID not in", values, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdBetween(Integer value1, Integer value2) {
            addCriterion("APPLY_USER_ID between", value1, value2, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("APPLY_USER_ID not between", value1, value2, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameIsNull() {
            addCriterion("APPLY_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameIsNotNull() {
            addCriterion("APPLY_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameEqualTo(String value) {
            addCriterion("APPLY_USER_NAME =", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameNotEqualTo(String value) {
            addCriterion("APPLY_USER_NAME <>", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameGreaterThan(String value) {
            addCriterion("APPLY_USER_NAME >", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_USER_NAME >=", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameLessThan(String value) {
            addCriterion("APPLY_USER_NAME <", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameLessThanOrEqualTo(String value) {
            addCriterion("APPLY_USER_NAME <=", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameLike(String value) {
            addCriterion("APPLY_USER_NAME like", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameNotLike(String value) {
            addCriterion("APPLY_USER_NAME not like", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameIn(List<String> values) {
            addCriterion("APPLY_USER_NAME in", values, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameNotIn(List<String> values) {
            addCriterion("APPLY_USER_NAME not in", values, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameBetween(String value1, String value2) {
            addCriterion("APPLY_USER_NAME between", value1, value2, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameNotBetween(String value1, String value2) {
            addCriterion("APPLY_USER_NAME not between", value1, value2, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserEmailIsNull() {
            addCriterion("APPLY_USER_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andApplyUserEmailIsNotNull() {
            addCriterion("APPLY_USER_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andApplyUserEmailEqualTo(String value) {
            addCriterion("APPLY_USER_EMAIL =", value, "applyUserEmail");
            return (Criteria) this;
        }

        public Criteria andApplyUserEmailNotEqualTo(String value) {
            addCriterion("APPLY_USER_EMAIL <>", value, "applyUserEmail");
            return (Criteria) this;
        }

        public Criteria andApplyUserEmailGreaterThan(String value) {
            addCriterion("APPLY_USER_EMAIL >", value, "applyUserEmail");
            return (Criteria) this;
        }

        public Criteria andApplyUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_USER_EMAIL >=", value, "applyUserEmail");
            return (Criteria) this;
        }

        public Criteria andApplyUserEmailLessThan(String value) {
            addCriterion("APPLY_USER_EMAIL <", value, "applyUserEmail");
            return (Criteria) this;
        }

        public Criteria andApplyUserEmailLessThanOrEqualTo(String value) {
            addCriterion("APPLY_USER_EMAIL <=", value, "applyUserEmail");
            return (Criteria) this;
        }

        public Criteria andApplyUserEmailLike(String value) {
            addCriterion("APPLY_USER_EMAIL like", value, "applyUserEmail");
            return (Criteria) this;
        }

        public Criteria andApplyUserEmailNotLike(String value) {
            addCriterion("APPLY_USER_EMAIL not like", value, "applyUserEmail");
            return (Criteria) this;
        }

        public Criteria andApplyUserEmailIn(List<String> values) {
            addCriterion("APPLY_USER_EMAIL in", values, "applyUserEmail");
            return (Criteria) this;
        }

        public Criteria andApplyUserEmailNotIn(List<String> values) {
            addCriterion("APPLY_USER_EMAIL not in", values, "applyUserEmail");
            return (Criteria) this;
        }

        public Criteria andApplyUserEmailBetween(String value1, String value2) {
            addCriterion("APPLY_USER_EMAIL between", value1, value2, "applyUserEmail");
            return (Criteria) this;
        }

        public Criteria andApplyUserEmailNotBetween(String value1, String value2) {
            addCriterion("APPLY_USER_EMAIL not between", value1, value2, "applyUserEmail");
            return (Criteria) this;
        }

        public Criteria andApplyUserMobileIsNull() {
            addCriterion("APPLY_USER_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andApplyUserMobileIsNotNull() {
            addCriterion("APPLY_USER_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyUserMobileEqualTo(String value) {
            addCriterion("APPLY_USER_MOBILE =", value, "applyUserMobile");
            return (Criteria) this;
        }

        public Criteria andApplyUserMobileNotEqualTo(String value) {
            addCriterion("APPLY_USER_MOBILE <>", value, "applyUserMobile");
            return (Criteria) this;
        }

        public Criteria andApplyUserMobileGreaterThan(String value) {
            addCriterion("APPLY_USER_MOBILE >", value, "applyUserMobile");
            return (Criteria) this;
        }

        public Criteria andApplyUserMobileGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_USER_MOBILE >=", value, "applyUserMobile");
            return (Criteria) this;
        }

        public Criteria andApplyUserMobileLessThan(String value) {
            addCriterion("APPLY_USER_MOBILE <", value, "applyUserMobile");
            return (Criteria) this;
        }

        public Criteria andApplyUserMobileLessThanOrEqualTo(String value) {
            addCriterion("APPLY_USER_MOBILE <=", value, "applyUserMobile");
            return (Criteria) this;
        }

        public Criteria andApplyUserMobileLike(String value) {
            addCriterion("APPLY_USER_MOBILE like", value, "applyUserMobile");
            return (Criteria) this;
        }

        public Criteria andApplyUserMobileNotLike(String value) {
            addCriterion("APPLY_USER_MOBILE not like", value, "applyUserMobile");
            return (Criteria) this;
        }

        public Criteria andApplyUserMobileIn(List<String> values) {
            addCriterion("APPLY_USER_MOBILE in", values, "applyUserMobile");
            return (Criteria) this;
        }

        public Criteria andApplyUserMobileNotIn(List<String> values) {
            addCriterion("APPLY_USER_MOBILE not in", values, "applyUserMobile");
            return (Criteria) this;
        }

        public Criteria andApplyUserMobileBetween(String value1, String value2) {
            addCriterion("APPLY_USER_MOBILE between", value1, value2, "applyUserMobile");
            return (Criteria) this;
        }

        public Criteria andApplyUserMobileNotBetween(String value1, String value2) {
            addCriterion("APPLY_USER_MOBILE not between", value1, value2, "applyUserMobile");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("APPLY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("APPLY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(String value) {
            addCriterion("APPLY_TIME =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(String value) {
            addCriterion("APPLY_TIME <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(String value) {
            addCriterion("APPLY_TIME >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_TIME >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(String value) {
            addCriterion("APPLY_TIME <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(String value) {
            addCriterion("APPLY_TIME <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLike(String value) {
            addCriterion("APPLY_TIME like", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotLike(String value) {
            addCriterion("APPLY_TIME not like", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<String> values) {
            addCriterion("APPLY_TIME in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<String> values) {
            addCriterion("APPLY_TIME not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(String value1, String value2) {
            addCriterion("APPLY_TIME between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(String value1, String value2) {
            addCriterion("APPLY_TIME not between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStatusIsNull() {
            addCriterion("AUTHORIZE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStatusIsNotNull() {
            addCriterion("AUTHORIZE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStatusEqualTo(String value) {
            addCriterion("AUTHORIZE_STATUS =", value, "authorizeStatus");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStatusNotEqualTo(String value) {
            addCriterion("AUTHORIZE_STATUS <>", value, "authorizeStatus");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStatusGreaterThan(String value) {
            addCriterion("AUTHORIZE_STATUS >", value, "authorizeStatus");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHORIZE_STATUS >=", value, "authorizeStatus");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStatusLessThan(String value) {
            addCriterion("AUTHORIZE_STATUS <", value, "authorizeStatus");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStatusLessThanOrEqualTo(String value) {
            addCriterion("AUTHORIZE_STATUS <=", value, "authorizeStatus");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStatusLike(String value) {
            addCriterion("AUTHORIZE_STATUS like", value, "authorizeStatus");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStatusNotLike(String value) {
            addCriterion("AUTHORIZE_STATUS not like", value, "authorizeStatus");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStatusIn(List<String> values) {
            addCriterion("AUTHORIZE_STATUS in", values, "authorizeStatus");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStatusNotIn(List<String> values) {
            addCriterion("AUTHORIZE_STATUS not in", values, "authorizeStatus");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStatusBetween(String value1, String value2) {
            addCriterion("AUTHORIZE_STATUS between", value1, value2, "authorizeStatus");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStatusNotBetween(String value1, String value2) {
            addCriterion("AUTHORIZE_STATUS not between", value1, value2, "authorizeStatus");
            return (Criteria) this;
        }

        public Criteria andProcessTimeIsNull() {
            addCriterion("PROCESS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andProcessTimeIsNotNull() {
            addCriterion("PROCESS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andProcessTimeEqualTo(String value) {
            addCriterion("PROCESS_TIME =", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeNotEqualTo(String value) {
            addCriterion("PROCESS_TIME <>", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeGreaterThan(String value) {
            addCriterion("PROCESS_TIME >", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESS_TIME >=", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeLessThan(String value) {
            addCriterion("PROCESS_TIME <", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeLessThanOrEqualTo(String value) {
            addCriterion("PROCESS_TIME <=", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeLike(String value) {
            addCriterion("PROCESS_TIME like", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeNotLike(String value) {
            addCriterion("PROCESS_TIME not like", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeIn(List<String> values) {
            addCriterion("PROCESS_TIME in", values, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeNotIn(List<String> values) {
            addCriterion("PROCESS_TIME not in", values, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeBetween(String value1, String value2) {
            addCriterion("PROCESS_TIME between", value1, value2, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeNotBetween(String value1, String value2) {
            addCriterion("PROCESS_TIME not between", value1, value2, "processTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUserIdIsNull() {
            addCriterion("ENTERPRISE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUserIdIsNotNull() {
            addCriterion("ENTERPRISE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUserIdEqualTo(Integer value) {
            addCriterion("ENTERPRISE_USER_ID =", value, "enterpriseUserId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUserIdNotEqualTo(Integer value) {
            addCriterion("ENTERPRISE_USER_ID <>", value, "enterpriseUserId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUserIdGreaterThan(Integer value) {
            addCriterion("ENTERPRISE_USER_ID >", value, "enterpriseUserId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ENTERPRISE_USER_ID >=", value, "enterpriseUserId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUserIdLessThan(Integer value) {
            addCriterion("ENTERPRISE_USER_ID <", value, "enterpriseUserId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("ENTERPRISE_USER_ID <=", value, "enterpriseUserId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUserIdIn(List<Integer> values) {
            addCriterion("ENTERPRISE_USER_ID in", values, "enterpriseUserId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUserIdNotIn(List<Integer> values) {
            addCriterion("ENTERPRISE_USER_ID not in", values, "enterpriseUserId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUserIdBetween(Integer value1, Integer value2) {
            addCriterion("ENTERPRISE_USER_ID between", value1, value2, "enterpriseUserId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ENTERPRISE_USER_ID not between", value1, value2, "enterpriseUserId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUserNameIsNull() {
            addCriterion("ENTERPRISE_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUserNameIsNotNull() {
            addCriterion("ENTERPRISE_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUserNameEqualTo(String value) {
            addCriterion("ENTERPRISE_USER_NAME =", value, "enterpriseUserName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUserNameNotEqualTo(String value) {
            addCriterion("ENTERPRISE_USER_NAME <>", value, "enterpriseUserName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUserNameGreaterThan(String value) {
            addCriterion("ENTERPRISE_USER_NAME >", value, "enterpriseUserName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("ENTERPRISE_USER_NAME >=", value, "enterpriseUserName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUserNameLessThan(String value) {
            addCriterion("ENTERPRISE_USER_NAME <", value, "enterpriseUserName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUserNameLessThanOrEqualTo(String value) {
            addCriterion("ENTERPRISE_USER_NAME <=", value, "enterpriseUserName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUserNameLike(String value) {
            addCriterion("ENTERPRISE_USER_NAME like", value, "enterpriseUserName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUserNameNotLike(String value) {
            addCriterion("ENTERPRISE_USER_NAME not like", value, "enterpriseUserName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUserNameIn(List<String> values) {
            addCriterion("ENTERPRISE_USER_NAME in", values, "enterpriseUserName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUserNameNotIn(List<String> values) {
            addCriterion("ENTERPRISE_USER_NAME not in", values, "enterpriseUserName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUserNameBetween(String value1, String value2) {
            addCriterion("ENTERPRISE_USER_NAME between", value1, value2, "enterpriseUserName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUserNameNotBetween(String value1, String value2) {
            addCriterion("ENTERPRISE_USER_NAME not between", value1, value2, "enterpriseUserName");
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