package com.medicalproj.common.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransactionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransactionExample() {
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

        public Criteria andTransIdIsNull() {
            addCriterion("TRANS_ID is null");
            return (Criteria) this;
        }

        public Criteria andTransIdIsNotNull() {
            addCriterion("TRANS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTransIdEqualTo(String value) {
            addCriterion("TRANS_ID =", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotEqualTo(String value) {
            addCriterion("TRANS_ID <>", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdGreaterThan(String value) {
            addCriterion("TRANS_ID >", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_ID >=", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLessThan(String value) {
            addCriterion("TRANS_ID <", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLessThanOrEqualTo(String value) {
            addCriterion("TRANS_ID <=", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLike(String value) {
            addCriterion("TRANS_ID like", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotLike(String value) {
            addCriterion("TRANS_ID not like", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdIn(List<String> values) {
            addCriterion("TRANS_ID in", values, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotIn(List<String> values) {
            addCriterion("TRANS_ID not in", values, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdBetween(String value1, String value2) {
            addCriterion("TRANS_ID between", value1, value2, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotBetween(String value1, String value2) {
            addCriterion("TRANS_ID not between", value1, value2, "transId");
            return (Criteria) this;
        }

        public Criteria andPayPlatformTransIdIsNull() {
            addCriterion("PAY_PLATFORM_TRANS_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayPlatformTransIdIsNotNull() {
            addCriterion("PAY_PLATFORM_TRANS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayPlatformTransIdEqualTo(String value) {
            addCriterion("PAY_PLATFORM_TRANS_ID =", value, "payPlatformTransId");
            return (Criteria) this;
        }

        public Criteria andPayPlatformTransIdNotEqualTo(String value) {
            addCriterion("PAY_PLATFORM_TRANS_ID <>", value, "payPlatformTransId");
            return (Criteria) this;
        }

        public Criteria andPayPlatformTransIdGreaterThan(String value) {
            addCriterion("PAY_PLATFORM_TRANS_ID >", value, "payPlatformTransId");
            return (Criteria) this;
        }

        public Criteria andPayPlatformTransIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_PLATFORM_TRANS_ID >=", value, "payPlatformTransId");
            return (Criteria) this;
        }

        public Criteria andPayPlatformTransIdLessThan(String value) {
            addCriterion("PAY_PLATFORM_TRANS_ID <", value, "payPlatformTransId");
            return (Criteria) this;
        }

        public Criteria andPayPlatformTransIdLessThanOrEqualTo(String value) {
            addCriterion("PAY_PLATFORM_TRANS_ID <=", value, "payPlatformTransId");
            return (Criteria) this;
        }

        public Criteria andPayPlatformTransIdLike(String value) {
            addCriterion("PAY_PLATFORM_TRANS_ID like", value, "payPlatformTransId");
            return (Criteria) this;
        }

        public Criteria andPayPlatformTransIdNotLike(String value) {
            addCriterion("PAY_PLATFORM_TRANS_ID not like", value, "payPlatformTransId");
            return (Criteria) this;
        }

        public Criteria andPayPlatformTransIdIn(List<String> values) {
            addCriterion("PAY_PLATFORM_TRANS_ID in", values, "payPlatformTransId");
            return (Criteria) this;
        }

        public Criteria andPayPlatformTransIdNotIn(List<String> values) {
            addCriterion("PAY_PLATFORM_TRANS_ID not in", values, "payPlatformTransId");
            return (Criteria) this;
        }

        public Criteria andPayPlatformTransIdBetween(String value1, String value2) {
            addCriterion("PAY_PLATFORM_TRANS_ID between", value1, value2, "payPlatformTransId");
            return (Criteria) this;
        }

        public Criteria andPayPlatformTransIdNotBetween(String value1, String value2) {
            addCriterion("PAY_PLATFORM_TRANS_ID not between", value1, value2, "payPlatformTransId");
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

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
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

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andDescIsNull() {
            addCriterion("DESC is null");
            return (Criteria) this;
        }

        public Criteria andDescIsNotNull() {
            addCriterion("DESC is not null");
            return (Criteria) this;
        }

        public Criteria andDescEqualTo(String value) {
            addCriterion("DESC =", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotEqualTo(String value) {
            addCriterion("DESC <>", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThan(String value) {
            addCriterion("DESC >", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThanOrEqualTo(String value) {
            addCriterion("DESC >=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThan(String value) {
            addCriterion("DESC <", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThanOrEqualTo(String value) {
            addCriterion("DESC <=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLike(String value) {
            addCriterion("DESC like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotLike(String value) {
            addCriterion("DESC not like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescIn(List<String> values) {
            addCriterion("DESC in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotIn(List<String> values) {
            addCriterion("DESC not in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescBetween(String value1, String value2) {
            addCriterion("DESC between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotBetween(String value1, String value2) {
            addCriterion("DESC not between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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

        public Criteria andPayPlatformTypeIsNull() {
            addCriterion("PAY_PLATFORM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPayPlatformTypeIsNotNull() {
            addCriterion("PAY_PLATFORM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPayPlatformTypeEqualTo(Integer value) {
            addCriterion("PAY_PLATFORM_TYPE =", value, "payPlatformType");
            return (Criteria) this;
        }

        public Criteria andPayPlatformTypeNotEqualTo(Integer value) {
            addCriterion("PAY_PLATFORM_TYPE <>", value, "payPlatformType");
            return (Criteria) this;
        }

        public Criteria andPayPlatformTypeGreaterThan(Integer value) {
            addCriterion("PAY_PLATFORM_TYPE >", value, "payPlatformType");
            return (Criteria) this;
        }

        public Criteria andPayPlatformTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAY_PLATFORM_TYPE >=", value, "payPlatformType");
            return (Criteria) this;
        }

        public Criteria andPayPlatformTypeLessThan(Integer value) {
            addCriterion("PAY_PLATFORM_TYPE <", value, "payPlatformType");
            return (Criteria) this;
        }

        public Criteria andPayPlatformTypeLessThanOrEqualTo(Integer value) {
            addCriterion("PAY_PLATFORM_TYPE <=", value, "payPlatformType");
            return (Criteria) this;
        }

        public Criteria andPayPlatformTypeIn(List<Integer> values) {
            addCriterion("PAY_PLATFORM_TYPE in", values, "payPlatformType");
            return (Criteria) this;
        }

        public Criteria andPayPlatformTypeNotIn(List<Integer> values) {
            addCriterion("PAY_PLATFORM_TYPE not in", values, "payPlatformType");
            return (Criteria) this;
        }

        public Criteria andPayPlatformTypeBetween(Integer value1, Integer value2) {
            addCriterion("PAY_PLATFORM_TYPE between", value1, value2, "payPlatformType");
            return (Criteria) this;
        }

        public Criteria andPayPlatformTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("PAY_PLATFORM_TYPE not between", value1, value2, "payPlatformType");
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