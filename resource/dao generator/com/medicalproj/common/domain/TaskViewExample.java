package com.medicalproj.common.domain;

import java.util.ArrayList;
import java.util.List;

public class TaskViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskViewExample() {
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

        public Criteria andTaskTypeIsNull() {
            addCriterion("TASK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNotNull() {
            addCriterion("TASK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeEqualTo(String value) {
            addCriterion("TASK_TYPE =", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotEqualTo(String value) {
            addCriterion("TASK_TYPE <>", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThan(String value) {
            addCriterion("TASK_TYPE >", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_TYPE >=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThan(String value) {
            addCriterion("TASK_TYPE <", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThanOrEqualTo(String value) {
            addCriterion("TASK_TYPE <=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLike(String value) {
            addCriterion("TASK_TYPE like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotLike(String value) {
            addCriterion("TASK_TYPE not like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIn(List<String> values) {
            addCriterion("TASK_TYPE in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotIn(List<String> values) {
            addCriterion("TASK_TYPE not in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeBetween(String value1, String value2) {
            addCriterion("TASK_TYPE between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotBetween(String value1, String value2) {
            addCriterion("TASK_TYPE not between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIsNull() {
            addCriterion("TASK_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIsNotNull() {
            addCriterion("TASK_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusEqualTo(String value) {
            addCriterion("TASK_STATUS =", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotEqualTo(String value) {
            addCriterion("TASK_STATUS <>", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusGreaterThan(String value) {
            addCriterion("TASK_STATUS >", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_STATUS >=", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLessThan(String value) {
            addCriterion("TASK_STATUS <", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLessThanOrEqualTo(String value) {
            addCriterion("TASK_STATUS <=", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLike(String value) {
            addCriterion("TASK_STATUS like", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotLike(String value) {
            addCriterion("TASK_STATUS not like", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIn(List<String> values) {
            addCriterion("TASK_STATUS in", values, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotIn(List<String> values) {
            addCriterion("TASK_STATUS not in", values, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusBetween(String value1, String value2) {
            addCriterion("TASK_STATUS between", value1, value2, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotBetween(String value1, String value2) {
            addCriterion("TASK_STATUS not between", value1, value2, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNull() {
            addCriterion("RESOURCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNotNull() {
            addCriterion("RESOURCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andResourceIdEqualTo(Long value) {
            addCriterion("RESOURCE_ID =", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotEqualTo(Long value) {
            addCriterion("RESOURCE_ID <>", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThan(Long value) {
            addCriterion("RESOURCE_ID >", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("RESOURCE_ID >=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThan(Long value) {
            addCriterion("RESOURCE_ID <", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThanOrEqualTo(Long value) {
            addCriterion("RESOURCE_ID <=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdIn(List<Long> values) {
            addCriterion("RESOURCE_ID in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotIn(List<Long> values) {
            addCriterion("RESOURCE_ID not in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdBetween(Long value1, Long value2) {
            addCriterion("RESOURCE_ID between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotBetween(Long value1, Long value2) {
            addCriterion("RESOURCE_ID not between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeIsNull() {
            addCriterion("TASK_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeIsNotNull() {
            addCriterion("TASK_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeEqualTo(String value) {
            addCriterion("TASK_CREATE_TIME =", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeNotEqualTo(String value) {
            addCriterion("TASK_CREATE_TIME <>", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeGreaterThan(String value) {
            addCriterion("TASK_CREATE_TIME >", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_CREATE_TIME >=", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeLessThan(String value) {
            addCriterion("TASK_CREATE_TIME <", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("TASK_CREATE_TIME <=", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeLike(String value) {
            addCriterion("TASK_CREATE_TIME like", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeNotLike(String value) {
            addCriterion("TASK_CREATE_TIME not like", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeIn(List<String> values) {
            addCriterion("TASK_CREATE_TIME in", values, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeNotIn(List<String> values) {
            addCriterion("TASK_CREATE_TIME not in", values, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeBetween(String value1, String value2) {
            addCriterion("TASK_CREATE_TIME between", value1, value2, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeNotBetween(String value1, String value2) {
            addCriterion("TASK_CREATE_TIME not between", value1, value2, "taskCreateTime");
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

        public Criteria andTaskOwnerUserIdIsNull() {
            addCriterion("TASK_OWNER_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserIdIsNotNull() {
            addCriterion("TASK_OWNER_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserIdEqualTo(Integer value) {
            addCriterion("TASK_OWNER_USER_ID =", value, "taskOwnerUserId");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserIdNotEqualTo(Integer value) {
            addCriterion("TASK_OWNER_USER_ID <>", value, "taskOwnerUserId");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserIdGreaterThan(Integer value) {
            addCriterion("TASK_OWNER_USER_ID >", value, "taskOwnerUserId");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TASK_OWNER_USER_ID >=", value, "taskOwnerUserId");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserIdLessThan(Integer value) {
            addCriterion("TASK_OWNER_USER_ID <", value, "taskOwnerUserId");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("TASK_OWNER_USER_ID <=", value, "taskOwnerUserId");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserIdIn(List<Integer> values) {
            addCriterion("TASK_OWNER_USER_ID in", values, "taskOwnerUserId");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserIdNotIn(List<Integer> values) {
            addCriterion("TASK_OWNER_USER_ID not in", values, "taskOwnerUserId");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserIdBetween(Integer value1, Integer value2) {
            addCriterion("TASK_OWNER_USER_ID between", value1, value2, "taskOwnerUserId");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TASK_OWNER_USER_ID not between", value1, value2, "taskOwnerUserId");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserNameIsNull() {
            addCriterion("TASK_OWNER_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserNameIsNotNull() {
            addCriterion("TASK_OWNER_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserNameEqualTo(String value) {
            addCriterion("TASK_OWNER_USER_NAME =", value, "taskOwnerUserName");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserNameNotEqualTo(String value) {
            addCriterion("TASK_OWNER_USER_NAME <>", value, "taskOwnerUserName");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserNameGreaterThan(String value) {
            addCriterion("TASK_OWNER_USER_NAME >", value, "taskOwnerUserName");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_OWNER_USER_NAME >=", value, "taskOwnerUserName");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserNameLessThan(String value) {
            addCriterion("TASK_OWNER_USER_NAME <", value, "taskOwnerUserName");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserNameLessThanOrEqualTo(String value) {
            addCriterion("TASK_OWNER_USER_NAME <=", value, "taskOwnerUserName");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserNameLike(String value) {
            addCriterion("TASK_OWNER_USER_NAME like", value, "taskOwnerUserName");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserNameNotLike(String value) {
            addCriterion("TASK_OWNER_USER_NAME not like", value, "taskOwnerUserName");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserNameIn(List<String> values) {
            addCriterion("TASK_OWNER_USER_NAME in", values, "taskOwnerUserName");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserNameNotIn(List<String> values) {
            addCriterion("TASK_OWNER_USER_NAME not in", values, "taskOwnerUserName");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserNameBetween(String value1, String value2) {
            addCriterion("TASK_OWNER_USER_NAME between", value1, value2, "taskOwnerUserName");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserNameNotBetween(String value1, String value2) {
            addCriterion("TASK_OWNER_USER_NAME not between", value1, value2, "taskOwnerUserName");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserEmailIsNull() {
            addCriterion("TASK_OWNER_USER_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserEmailIsNotNull() {
            addCriterion("TASK_OWNER_USER_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserEmailEqualTo(String value) {
            addCriterion("TASK_OWNER_USER_EMAIL =", value, "taskOwnerUserEmail");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserEmailNotEqualTo(String value) {
            addCriterion("TASK_OWNER_USER_EMAIL <>", value, "taskOwnerUserEmail");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserEmailGreaterThan(String value) {
            addCriterion("TASK_OWNER_USER_EMAIL >", value, "taskOwnerUserEmail");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_OWNER_USER_EMAIL >=", value, "taskOwnerUserEmail");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserEmailLessThan(String value) {
            addCriterion("TASK_OWNER_USER_EMAIL <", value, "taskOwnerUserEmail");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserEmailLessThanOrEqualTo(String value) {
            addCriterion("TASK_OWNER_USER_EMAIL <=", value, "taskOwnerUserEmail");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserEmailLike(String value) {
            addCriterion("TASK_OWNER_USER_EMAIL like", value, "taskOwnerUserEmail");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserEmailNotLike(String value) {
            addCriterion("TASK_OWNER_USER_EMAIL not like", value, "taskOwnerUserEmail");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserEmailIn(List<String> values) {
            addCriterion("TASK_OWNER_USER_EMAIL in", values, "taskOwnerUserEmail");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserEmailNotIn(List<String> values) {
            addCriterion("TASK_OWNER_USER_EMAIL not in", values, "taskOwnerUserEmail");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserEmailBetween(String value1, String value2) {
            addCriterion("TASK_OWNER_USER_EMAIL between", value1, value2, "taskOwnerUserEmail");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserEmailNotBetween(String value1, String value2) {
            addCriterion("TASK_OWNER_USER_EMAIL not between", value1, value2, "taskOwnerUserEmail");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserMobileIsNull() {
            addCriterion("TASK_OWNER_USER_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserMobileIsNotNull() {
            addCriterion("TASK_OWNER_USER_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserMobileEqualTo(String value) {
            addCriterion("TASK_OWNER_USER_MOBILE =", value, "taskOwnerUserMobile");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserMobileNotEqualTo(String value) {
            addCriterion("TASK_OWNER_USER_MOBILE <>", value, "taskOwnerUserMobile");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserMobileGreaterThan(String value) {
            addCriterion("TASK_OWNER_USER_MOBILE >", value, "taskOwnerUserMobile");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserMobileGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_OWNER_USER_MOBILE >=", value, "taskOwnerUserMobile");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserMobileLessThan(String value) {
            addCriterion("TASK_OWNER_USER_MOBILE <", value, "taskOwnerUserMobile");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserMobileLessThanOrEqualTo(String value) {
            addCriterion("TASK_OWNER_USER_MOBILE <=", value, "taskOwnerUserMobile");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserMobileLike(String value) {
            addCriterion("TASK_OWNER_USER_MOBILE like", value, "taskOwnerUserMobile");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserMobileNotLike(String value) {
            addCriterion("TASK_OWNER_USER_MOBILE not like", value, "taskOwnerUserMobile");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserMobileIn(List<String> values) {
            addCriterion("TASK_OWNER_USER_MOBILE in", values, "taskOwnerUserMobile");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserMobileNotIn(List<String> values) {
            addCriterion("TASK_OWNER_USER_MOBILE not in", values, "taskOwnerUserMobile");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserMobileBetween(String value1, String value2) {
            addCriterion("TASK_OWNER_USER_MOBILE between", value1, value2, "taskOwnerUserMobile");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerUserMobileNotBetween(String value1, String value2) {
            addCriterion("TASK_OWNER_USER_MOBILE not between", value1, value2, "taskOwnerUserMobile");
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