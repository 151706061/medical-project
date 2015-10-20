package com.medicalproj.common.domain;

import java.util.ArrayList;
import java.util.List;

public class QualificationApplicationViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QualificationApplicationViewExample() {
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

        public Criteria andApplyUserMoobileIsNull() {
            addCriterion("APPLY_USER_MOOBILE is null");
            return (Criteria) this;
        }

        public Criteria andApplyUserMoobileIsNotNull() {
            addCriterion("APPLY_USER_MOOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyUserMoobileEqualTo(String value) {
            addCriterion("APPLY_USER_MOOBILE =", value, "applyUserMoobile");
            return (Criteria) this;
        }

        public Criteria andApplyUserMoobileNotEqualTo(String value) {
            addCriterion("APPLY_USER_MOOBILE <>", value, "applyUserMoobile");
            return (Criteria) this;
        }

        public Criteria andApplyUserMoobileGreaterThan(String value) {
            addCriterion("APPLY_USER_MOOBILE >", value, "applyUserMoobile");
            return (Criteria) this;
        }

        public Criteria andApplyUserMoobileGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_USER_MOOBILE >=", value, "applyUserMoobile");
            return (Criteria) this;
        }

        public Criteria andApplyUserMoobileLessThan(String value) {
            addCriterion("APPLY_USER_MOOBILE <", value, "applyUserMoobile");
            return (Criteria) this;
        }

        public Criteria andApplyUserMoobileLessThanOrEqualTo(String value) {
            addCriterion("APPLY_USER_MOOBILE <=", value, "applyUserMoobile");
            return (Criteria) this;
        }

        public Criteria andApplyUserMoobileLike(String value) {
            addCriterion("APPLY_USER_MOOBILE like", value, "applyUserMoobile");
            return (Criteria) this;
        }

        public Criteria andApplyUserMoobileNotLike(String value) {
            addCriterion("APPLY_USER_MOOBILE not like", value, "applyUserMoobile");
            return (Criteria) this;
        }

        public Criteria andApplyUserMoobileIn(List<String> values) {
            addCriterion("APPLY_USER_MOOBILE in", values, "applyUserMoobile");
            return (Criteria) this;
        }

        public Criteria andApplyUserMoobileNotIn(List<String> values) {
            addCriterion("APPLY_USER_MOOBILE not in", values, "applyUserMoobile");
            return (Criteria) this;
        }

        public Criteria andApplyUserMoobileBetween(String value1, String value2) {
            addCriterion("APPLY_USER_MOOBILE between", value1, value2, "applyUserMoobile");
            return (Criteria) this;
        }

        public Criteria andApplyUserMoobileNotBetween(String value1, String value2) {
            addCriterion("APPLY_USER_MOOBILE not between", value1, value2, "applyUserMoobile");
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

        public Criteria andYszgzImgRelativePathIsNull() {
            addCriterion("YSZGZ_IMG_RELATIVE_PATH is null");
            return (Criteria) this;
        }

        public Criteria andYszgzImgRelativePathIsNotNull() {
            addCriterion("YSZGZ_IMG_RELATIVE_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andYszgzImgRelativePathEqualTo(String value) {
            addCriterion("YSZGZ_IMG_RELATIVE_PATH =", value, "yszgzImgRelativePath");
            return (Criteria) this;
        }

        public Criteria andYszgzImgRelativePathNotEqualTo(String value) {
            addCriterion("YSZGZ_IMG_RELATIVE_PATH <>", value, "yszgzImgRelativePath");
            return (Criteria) this;
        }

        public Criteria andYszgzImgRelativePathGreaterThan(String value) {
            addCriterion("YSZGZ_IMG_RELATIVE_PATH >", value, "yszgzImgRelativePath");
            return (Criteria) this;
        }

        public Criteria andYszgzImgRelativePathGreaterThanOrEqualTo(String value) {
            addCriterion("YSZGZ_IMG_RELATIVE_PATH >=", value, "yszgzImgRelativePath");
            return (Criteria) this;
        }

        public Criteria andYszgzImgRelativePathLessThan(String value) {
            addCriterion("YSZGZ_IMG_RELATIVE_PATH <", value, "yszgzImgRelativePath");
            return (Criteria) this;
        }

        public Criteria andYszgzImgRelativePathLessThanOrEqualTo(String value) {
            addCriterion("YSZGZ_IMG_RELATIVE_PATH <=", value, "yszgzImgRelativePath");
            return (Criteria) this;
        }

        public Criteria andYszgzImgRelativePathLike(String value) {
            addCriterion("YSZGZ_IMG_RELATIVE_PATH like", value, "yszgzImgRelativePath");
            return (Criteria) this;
        }

        public Criteria andYszgzImgRelativePathNotLike(String value) {
            addCriterion("YSZGZ_IMG_RELATIVE_PATH not like", value, "yszgzImgRelativePath");
            return (Criteria) this;
        }

        public Criteria andYszgzImgRelativePathIn(List<String> values) {
            addCriterion("YSZGZ_IMG_RELATIVE_PATH in", values, "yszgzImgRelativePath");
            return (Criteria) this;
        }

        public Criteria andYszgzImgRelativePathNotIn(List<String> values) {
            addCriterion("YSZGZ_IMG_RELATIVE_PATH not in", values, "yszgzImgRelativePath");
            return (Criteria) this;
        }

        public Criteria andYszgzImgRelativePathBetween(String value1, String value2) {
            addCriterion("YSZGZ_IMG_RELATIVE_PATH between", value1, value2, "yszgzImgRelativePath");
            return (Criteria) this;
        }

        public Criteria andYszgzImgRelativePathNotBetween(String value1, String value2) {
            addCriterion("YSZGZ_IMG_RELATIVE_PATH not between", value1, value2, "yszgzImgRelativePath");
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

        public Criteria andReviewTextIsNull() {
            addCriterion("REVIEW_TEXT is null");
            return (Criteria) this;
        }

        public Criteria andReviewTextIsNotNull() {
            addCriterion("REVIEW_TEXT is not null");
            return (Criteria) this;
        }

        public Criteria andReviewTextEqualTo(String value) {
            addCriterion("REVIEW_TEXT =", value, "reviewText");
            return (Criteria) this;
        }

        public Criteria andReviewTextNotEqualTo(String value) {
            addCriterion("REVIEW_TEXT <>", value, "reviewText");
            return (Criteria) this;
        }

        public Criteria andReviewTextGreaterThan(String value) {
            addCriterion("REVIEW_TEXT >", value, "reviewText");
            return (Criteria) this;
        }

        public Criteria andReviewTextGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEW_TEXT >=", value, "reviewText");
            return (Criteria) this;
        }

        public Criteria andReviewTextLessThan(String value) {
            addCriterion("REVIEW_TEXT <", value, "reviewText");
            return (Criteria) this;
        }

        public Criteria andReviewTextLessThanOrEqualTo(String value) {
            addCriterion("REVIEW_TEXT <=", value, "reviewText");
            return (Criteria) this;
        }

        public Criteria andReviewTextLike(String value) {
            addCriterion("REVIEW_TEXT like", value, "reviewText");
            return (Criteria) this;
        }

        public Criteria andReviewTextNotLike(String value) {
            addCriterion("REVIEW_TEXT not like", value, "reviewText");
            return (Criteria) this;
        }

        public Criteria andReviewTextIn(List<String> values) {
            addCriterion("REVIEW_TEXT in", values, "reviewText");
            return (Criteria) this;
        }

        public Criteria andReviewTextNotIn(List<String> values) {
            addCriterion("REVIEW_TEXT not in", values, "reviewText");
            return (Criteria) this;
        }

        public Criteria andReviewTextBetween(String value1, String value2) {
            addCriterion("REVIEW_TEXT between", value1, value2, "reviewText");
            return (Criteria) this;
        }

        public Criteria andReviewTextNotBetween(String value1, String value2) {
            addCriterion("REVIEW_TEXT not between", value1, value2, "reviewText");
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