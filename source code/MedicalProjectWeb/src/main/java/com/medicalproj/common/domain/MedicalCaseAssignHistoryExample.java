package com.medicalproj.common.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MedicalCaseAssignHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedicalCaseAssignHistoryExample() {
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

        public Criteria andAssignUserIdIsNull() {
            addCriterion("ASSIGN_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andAssignUserIdIsNotNull() {
            addCriterion("ASSIGN_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAssignUserIdEqualTo(Integer value) {
            addCriterion("ASSIGN_USER_ID =", value, "assignUserId");
            return (Criteria) this;
        }

        public Criteria andAssignUserIdNotEqualTo(Integer value) {
            addCriterion("ASSIGN_USER_ID <>", value, "assignUserId");
            return (Criteria) this;
        }

        public Criteria andAssignUserIdGreaterThan(Integer value) {
            addCriterion("ASSIGN_USER_ID >", value, "assignUserId");
            return (Criteria) this;
        }

        public Criteria andAssignUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ASSIGN_USER_ID >=", value, "assignUserId");
            return (Criteria) this;
        }

        public Criteria andAssignUserIdLessThan(Integer value) {
            addCriterion("ASSIGN_USER_ID <", value, "assignUserId");
            return (Criteria) this;
        }

        public Criteria andAssignUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("ASSIGN_USER_ID <=", value, "assignUserId");
            return (Criteria) this;
        }

        public Criteria andAssignUserIdIn(List<Integer> values) {
            addCriterion("ASSIGN_USER_ID in", values, "assignUserId");
            return (Criteria) this;
        }

        public Criteria andAssignUserIdNotIn(List<Integer> values) {
            addCriterion("ASSIGN_USER_ID not in", values, "assignUserId");
            return (Criteria) this;
        }

        public Criteria andAssignUserIdBetween(Integer value1, Integer value2) {
            addCriterion("ASSIGN_USER_ID between", value1, value2, "assignUserId");
            return (Criteria) this;
        }

        public Criteria andAssignUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ASSIGN_USER_ID not between", value1, value2, "assignUserId");
            return (Criteria) this;
        }

        public Criteria andBeAssignedUserIdIsNull() {
            addCriterion("BE_ASSIGNED_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andBeAssignedUserIdIsNotNull() {
            addCriterion("BE_ASSIGNED_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBeAssignedUserIdEqualTo(Integer value) {
            addCriterion("BE_ASSIGNED_USER_ID =", value, "beAssignedUserId");
            return (Criteria) this;
        }

        public Criteria andBeAssignedUserIdNotEqualTo(Integer value) {
            addCriterion("BE_ASSIGNED_USER_ID <>", value, "beAssignedUserId");
            return (Criteria) this;
        }

        public Criteria andBeAssignedUserIdGreaterThan(Integer value) {
            addCriterion("BE_ASSIGNED_USER_ID >", value, "beAssignedUserId");
            return (Criteria) this;
        }

        public Criteria andBeAssignedUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BE_ASSIGNED_USER_ID >=", value, "beAssignedUserId");
            return (Criteria) this;
        }

        public Criteria andBeAssignedUserIdLessThan(Integer value) {
            addCriterion("BE_ASSIGNED_USER_ID <", value, "beAssignedUserId");
            return (Criteria) this;
        }

        public Criteria andBeAssignedUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("BE_ASSIGNED_USER_ID <=", value, "beAssignedUserId");
            return (Criteria) this;
        }

        public Criteria andBeAssignedUserIdIn(List<Integer> values) {
            addCriterion("BE_ASSIGNED_USER_ID in", values, "beAssignedUserId");
            return (Criteria) this;
        }

        public Criteria andBeAssignedUserIdNotIn(List<Integer> values) {
            addCriterion("BE_ASSIGNED_USER_ID not in", values, "beAssignedUserId");
            return (Criteria) this;
        }

        public Criteria andBeAssignedUserIdBetween(Integer value1, Integer value2) {
            addCriterion("BE_ASSIGNED_USER_ID between", value1, value2, "beAssignedUserId");
            return (Criteria) this;
        }

        public Criteria andBeAssignedUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BE_ASSIGNED_USER_ID not between", value1, value2, "beAssignedUserId");
            return (Criteria) this;
        }

        public Criteria andAssignTimeIsNull() {
            addCriterion("ASSIGN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAssignTimeIsNotNull() {
            addCriterion("ASSIGN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAssignTimeEqualTo(Date value) {
            addCriterion("ASSIGN_TIME =", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeNotEqualTo(Date value) {
            addCriterion("ASSIGN_TIME <>", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeGreaterThan(Date value) {
            addCriterion("ASSIGN_TIME >", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ASSIGN_TIME >=", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeLessThan(Date value) {
            addCriterion("ASSIGN_TIME <", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeLessThanOrEqualTo(Date value) {
            addCriterion("ASSIGN_TIME <=", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeIn(List<Date> values) {
            addCriterion("ASSIGN_TIME in", values, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeNotIn(List<Date> values) {
            addCriterion("ASSIGN_TIME not in", values, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeBetween(Date value1, Date value2) {
            addCriterion("ASSIGN_TIME between", value1, value2, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeNotBetween(Date value1, Date value2) {
            addCriterion("ASSIGN_TIME not between", value1, value2, "assignTime");
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