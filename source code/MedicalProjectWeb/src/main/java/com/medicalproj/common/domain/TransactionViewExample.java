package com.medicalproj.common.domain;

import java.util.ArrayList;
import java.util.List;

public class TransactionViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransactionViewExample() {
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

        public Criteria andTransIdIsNull() {
            addCriterion("TRANS_ID is null");
            return (Criteria) this;
        }

        public Criteria andTransIdIsNotNull() {
            addCriterion("TRANS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTransIdEqualTo(Integer value) {
            addCriterion("TRANS_ID =", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotEqualTo(Integer value) {
            addCriterion("TRANS_ID <>", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdGreaterThan(Integer value) {
            addCriterion("TRANS_ID >", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRANS_ID >=", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLessThan(Integer value) {
            addCriterion("TRANS_ID <", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLessThanOrEqualTo(Integer value) {
            addCriterion("TRANS_ID <=", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdIn(List<Integer> values) {
            addCriterion("TRANS_ID in", values, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotIn(List<Integer> values) {
            addCriterion("TRANS_ID not in", values, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdBetween(Integer value1, Integer value2) {
            addCriterion("TRANS_ID between", value1, value2, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TRANS_ID not between", value1, value2, "transId");
            return (Criteria) this;
        }

        public Criteria andTransTimeIsNull() {
            addCriterion("TRANS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTransTimeIsNotNull() {
            addCriterion("TRANS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTransTimeEqualTo(String value) {
            addCriterion("TRANS_TIME =", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotEqualTo(String value) {
            addCriterion("TRANS_TIME <>", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeGreaterThan(String value) {
            addCriterion("TRANS_TIME >", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_TIME >=", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeLessThan(String value) {
            addCriterion("TRANS_TIME <", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeLessThanOrEqualTo(String value) {
            addCriterion("TRANS_TIME <=", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeLike(String value) {
            addCriterion("TRANS_TIME like", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotLike(String value) {
            addCriterion("TRANS_TIME not like", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeIn(List<String> values) {
            addCriterion("TRANS_TIME in", values, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotIn(List<String> values) {
            addCriterion("TRANS_TIME not in", values, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeBetween(String value1, String value2) {
            addCriterion("TRANS_TIME between", value1, value2, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotBetween(String value1, String value2) {
            addCriterion("TRANS_TIME not between", value1, value2, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransAmountIsNull() {
            addCriterion("TRANS_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTransAmountIsNotNull() {
            addCriterion("TRANS_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTransAmountEqualTo(String value) {
            addCriterion("TRANS_AMOUNT =", value, "transAmount");
            return (Criteria) this;
        }

        public Criteria andTransAmountNotEqualTo(String value) {
            addCriterion("TRANS_AMOUNT <>", value, "transAmount");
            return (Criteria) this;
        }

        public Criteria andTransAmountGreaterThan(String value) {
            addCriterion("TRANS_AMOUNT >", value, "transAmount");
            return (Criteria) this;
        }

        public Criteria andTransAmountGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_AMOUNT >=", value, "transAmount");
            return (Criteria) this;
        }

        public Criteria andTransAmountLessThan(String value) {
            addCriterion("TRANS_AMOUNT <", value, "transAmount");
            return (Criteria) this;
        }

        public Criteria andTransAmountLessThanOrEqualTo(String value) {
            addCriterion("TRANS_AMOUNT <=", value, "transAmount");
            return (Criteria) this;
        }

        public Criteria andTransAmountLike(String value) {
            addCriterion("TRANS_AMOUNT like", value, "transAmount");
            return (Criteria) this;
        }

        public Criteria andTransAmountNotLike(String value) {
            addCriterion("TRANS_AMOUNT not like", value, "transAmount");
            return (Criteria) this;
        }

        public Criteria andTransAmountIn(List<String> values) {
            addCriterion("TRANS_AMOUNT in", values, "transAmount");
            return (Criteria) this;
        }

        public Criteria andTransAmountNotIn(List<String> values) {
            addCriterion("TRANS_AMOUNT not in", values, "transAmount");
            return (Criteria) this;
        }

        public Criteria andTransAmountBetween(String value1, String value2) {
            addCriterion("TRANS_AMOUNT between", value1, value2, "transAmount");
            return (Criteria) this;
        }

        public Criteria andTransAmountNotBetween(String value1, String value2) {
            addCriterion("TRANS_AMOUNT not between", value1, value2, "transAmount");
            return (Criteria) this;
        }

        public Criteria andTransDescIsNull() {
            addCriterion("TRANS_DESC is null");
            return (Criteria) this;
        }

        public Criteria andTransDescIsNotNull() {
            addCriterion("TRANS_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andTransDescEqualTo(String value) {
            addCriterion("TRANS_DESC =", value, "transDesc");
            return (Criteria) this;
        }

        public Criteria andTransDescNotEqualTo(String value) {
            addCriterion("TRANS_DESC <>", value, "transDesc");
            return (Criteria) this;
        }

        public Criteria andTransDescGreaterThan(String value) {
            addCriterion("TRANS_DESC >", value, "transDesc");
            return (Criteria) this;
        }

        public Criteria andTransDescGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_DESC >=", value, "transDesc");
            return (Criteria) this;
        }

        public Criteria andTransDescLessThan(String value) {
            addCriterion("TRANS_DESC <", value, "transDesc");
            return (Criteria) this;
        }

        public Criteria andTransDescLessThanOrEqualTo(String value) {
            addCriterion("TRANS_DESC <=", value, "transDesc");
            return (Criteria) this;
        }

        public Criteria andTransDescLike(String value) {
            addCriterion("TRANS_DESC like", value, "transDesc");
            return (Criteria) this;
        }

        public Criteria andTransDescNotLike(String value) {
            addCriterion("TRANS_DESC not like", value, "transDesc");
            return (Criteria) this;
        }

        public Criteria andTransDescIn(List<String> values) {
            addCriterion("TRANS_DESC in", values, "transDesc");
            return (Criteria) this;
        }

        public Criteria andTransDescNotIn(List<String> values) {
            addCriterion("TRANS_DESC not in", values, "transDesc");
            return (Criteria) this;
        }

        public Criteria andTransDescBetween(String value1, String value2) {
            addCriterion("TRANS_DESC between", value1, value2, "transDesc");
            return (Criteria) this;
        }

        public Criteria andTransDescNotBetween(String value1, String value2) {
            addCriterion("TRANS_DESC not between", value1, value2, "transDesc");
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdIsNull() {
            addCriterion("OWNER_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdIsNotNull() {
            addCriterion("OWNER_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdEqualTo(Integer value) {
            addCriterion("OWNER_USER_ID =", value, "ownerUserId");
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdNotEqualTo(Integer value) {
            addCriterion("OWNER_USER_ID <>", value, "ownerUserId");
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdGreaterThan(Integer value) {
            addCriterion("OWNER_USER_ID >", value, "ownerUserId");
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("OWNER_USER_ID >=", value, "ownerUserId");
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdLessThan(Integer value) {
            addCriterion("OWNER_USER_ID <", value, "ownerUserId");
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("OWNER_USER_ID <=", value, "ownerUserId");
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdIn(List<Integer> values) {
            addCriterion("OWNER_USER_ID in", values, "ownerUserId");
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdNotIn(List<Integer> values) {
            addCriterion("OWNER_USER_ID not in", values, "ownerUserId");
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdBetween(Integer value1, Integer value2) {
            addCriterion("OWNER_USER_ID between", value1, value2, "ownerUserId");
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("OWNER_USER_ID not between", value1, value2, "ownerUserId");
            return (Criteria) this;
        }

        public Criteria andTransTypeIsNull() {
            addCriterion("TRANS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTransTypeIsNotNull() {
            addCriterion("TRANS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTransTypeEqualTo(String value) {
            addCriterion("TRANS_TYPE =", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotEqualTo(String value) {
            addCriterion("TRANS_TYPE <>", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeGreaterThan(String value) {
            addCriterion("TRANS_TYPE >", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_TYPE >=", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeLessThan(String value) {
            addCriterion("TRANS_TYPE <", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeLessThanOrEqualTo(String value) {
            addCriterion("TRANS_TYPE <=", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeLike(String value) {
            addCriterion("TRANS_TYPE like", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotLike(String value) {
            addCriterion("TRANS_TYPE not like", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeIn(List<String> values) {
            addCriterion("TRANS_TYPE in", values, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotIn(List<String> values) {
            addCriterion("TRANS_TYPE not in", values, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeBetween(String value1, String value2) {
            addCriterion("TRANS_TYPE between", value1, value2, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotBetween(String value1, String value2) {
            addCriterion("TRANS_TYPE not between", value1, value2, "transType");
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