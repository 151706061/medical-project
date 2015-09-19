package com.medicalproj.common.domain;

import java.util.ArrayList;
import java.util.List;

public class InstanceViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InstanceViewExample() {
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

        public Criteria andDicomFileIdIsNull() {
            addCriterion("DICOM_FILE_ID is null");
            return (Criteria) this;
        }

        public Criteria andDicomFileIdIsNotNull() {
            addCriterion("DICOM_FILE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDicomFileIdEqualTo(Integer value) {
            addCriterion("DICOM_FILE_ID =", value, "dicomFileId");
            return (Criteria) this;
        }

        public Criteria andDicomFileIdNotEqualTo(Integer value) {
            addCriterion("DICOM_FILE_ID <>", value, "dicomFileId");
            return (Criteria) this;
        }

        public Criteria andDicomFileIdGreaterThan(Integer value) {
            addCriterion("DICOM_FILE_ID >", value, "dicomFileId");
            return (Criteria) this;
        }

        public Criteria andDicomFileIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DICOM_FILE_ID >=", value, "dicomFileId");
            return (Criteria) this;
        }

        public Criteria andDicomFileIdLessThan(Integer value) {
            addCriterion("DICOM_FILE_ID <", value, "dicomFileId");
            return (Criteria) this;
        }

        public Criteria andDicomFileIdLessThanOrEqualTo(Integer value) {
            addCriterion("DICOM_FILE_ID <=", value, "dicomFileId");
            return (Criteria) this;
        }

        public Criteria andDicomFileIdIn(List<Integer> values) {
            addCriterion("DICOM_FILE_ID in", values, "dicomFileId");
            return (Criteria) this;
        }

        public Criteria andDicomFileIdNotIn(List<Integer> values) {
            addCriterion("DICOM_FILE_ID not in", values, "dicomFileId");
            return (Criteria) this;
        }

        public Criteria andDicomFileIdBetween(Integer value1, Integer value2) {
            addCriterion("DICOM_FILE_ID between", value1, value2, "dicomFileId");
            return (Criteria) this;
        }

        public Criteria andDicomFileIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DICOM_FILE_ID not between", value1, value2, "dicomFileId");
            return (Criteria) this;
        }

        public Criteria andDicomFilePathIsNull() {
            addCriterion("DICOM_FILE_PATH is null");
            return (Criteria) this;
        }

        public Criteria andDicomFilePathIsNotNull() {
            addCriterion("DICOM_FILE_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andDicomFilePathEqualTo(String value) {
            addCriterion("DICOM_FILE_PATH =", value, "dicomFilePath");
            return (Criteria) this;
        }

        public Criteria andDicomFilePathNotEqualTo(String value) {
            addCriterion("DICOM_FILE_PATH <>", value, "dicomFilePath");
            return (Criteria) this;
        }

        public Criteria andDicomFilePathGreaterThan(String value) {
            addCriterion("DICOM_FILE_PATH >", value, "dicomFilePath");
            return (Criteria) this;
        }

        public Criteria andDicomFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("DICOM_FILE_PATH >=", value, "dicomFilePath");
            return (Criteria) this;
        }

        public Criteria andDicomFilePathLessThan(String value) {
            addCriterion("DICOM_FILE_PATH <", value, "dicomFilePath");
            return (Criteria) this;
        }

        public Criteria andDicomFilePathLessThanOrEqualTo(String value) {
            addCriterion("DICOM_FILE_PATH <=", value, "dicomFilePath");
            return (Criteria) this;
        }

        public Criteria andDicomFilePathLike(String value) {
            addCriterion("DICOM_FILE_PATH like", value, "dicomFilePath");
            return (Criteria) this;
        }

        public Criteria andDicomFilePathNotLike(String value) {
            addCriterion("DICOM_FILE_PATH not like", value, "dicomFilePath");
            return (Criteria) this;
        }

        public Criteria andDicomFilePathIn(List<String> values) {
            addCriterion("DICOM_FILE_PATH in", values, "dicomFilePath");
            return (Criteria) this;
        }

        public Criteria andDicomFilePathNotIn(List<String> values) {
            addCriterion("DICOM_FILE_PATH not in", values, "dicomFilePath");
            return (Criteria) this;
        }

        public Criteria andDicomFilePathBetween(String value1, String value2) {
            addCriterion("DICOM_FILE_PATH between", value1, value2, "dicomFilePath");
            return (Criteria) this;
        }

        public Criteria andDicomFilePathNotBetween(String value1, String value2) {
            addCriterion("DICOM_FILE_PATH not between", value1, value2, "dicomFilePath");
            return (Criteria) this;
        }

        public Criteria andDicomFileSizeIsNull() {
            addCriterion("DICOM_FILE_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andDicomFileSizeIsNotNull() {
            addCriterion("DICOM_FILE_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andDicomFileSizeEqualTo(Integer value) {
            addCriterion("DICOM_FILE_SIZE =", value, "dicomFileSize");
            return (Criteria) this;
        }

        public Criteria andDicomFileSizeNotEqualTo(Integer value) {
            addCriterion("DICOM_FILE_SIZE <>", value, "dicomFileSize");
            return (Criteria) this;
        }

        public Criteria andDicomFileSizeGreaterThan(Integer value) {
            addCriterion("DICOM_FILE_SIZE >", value, "dicomFileSize");
            return (Criteria) this;
        }

        public Criteria andDicomFileSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("DICOM_FILE_SIZE >=", value, "dicomFileSize");
            return (Criteria) this;
        }

        public Criteria andDicomFileSizeLessThan(Integer value) {
            addCriterion("DICOM_FILE_SIZE <", value, "dicomFileSize");
            return (Criteria) this;
        }

        public Criteria andDicomFileSizeLessThanOrEqualTo(Integer value) {
            addCriterion("DICOM_FILE_SIZE <=", value, "dicomFileSize");
            return (Criteria) this;
        }

        public Criteria andDicomFileSizeIn(List<Integer> values) {
            addCriterion("DICOM_FILE_SIZE in", values, "dicomFileSize");
            return (Criteria) this;
        }

        public Criteria andDicomFileSizeNotIn(List<Integer> values) {
            addCriterion("DICOM_FILE_SIZE not in", values, "dicomFileSize");
            return (Criteria) this;
        }

        public Criteria andDicomFileSizeBetween(Integer value1, Integer value2) {
            addCriterion("DICOM_FILE_SIZE between", value1, value2, "dicomFileSize");
            return (Criteria) this;
        }

        public Criteria andDicomFileSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("DICOM_FILE_SIZE not between", value1, value2, "dicomFileSize");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNull() {
            addCriterion("UPLOAD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNotNull() {
            addCriterion("UPLOAD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeEqualTo(String value) {
            addCriterion("UPLOAD_TIME =", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotEqualTo(String value) {
            addCriterion("UPLOAD_TIME <>", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThan(String value) {
            addCriterion("UPLOAD_TIME >", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThanOrEqualTo(String value) {
            addCriterion("UPLOAD_TIME >=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThan(String value) {
            addCriterion("UPLOAD_TIME <", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThanOrEqualTo(String value) {
            addCriterion("UPLOAD_TIME <=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLike(String value) {
            addCriterion("UPLOAD_TIME like", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotLike(String value) {
            addCriterion("UPLOAD_TIME not like", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIn(List<String> values) {
            addCriterion("UPLOAD_TIME in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotIn(List<String> values) {
            addCriterion("UPLOAD_TIME not in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeBetween(String value1, String value2) {
            addCriterion("UPLOAD_TIME between", value1, value2, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotBetween(String value1, String value2) {
            addCriterion("UPLOAD_TIME not between", value1, value2, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andDicomMd5IsNull() {
            addCriterion("DICOM_MD5 is null");
            return (Criteria) this;
        }

        public Criteria andDicomMd5IsNotNull() {
            addCriterion("DICOM_MD5 is not null");
            return (Criteria) this;
        }

        public Criteria andDicomMd5EqualTo(String value) {
            addCriterion("DICOM_MD5 =", value, "dicomMd5");
            return (Criteria) this;
        }

        public Criteria andDicomMd5NotEqualTo(String value) {
            addCriterion("DICOM_MD5 <>", value, "dicomMd5");
            return (Criteria) this;
        }

        public Criteria andDicomMd5GreaterThan(String value) {
            addCriterion("DICOM_MD5 >", value, "dicomMd5");
            return (Criteria) this;
        }

        public Criteria andDicomMd5GreaterThanOrEqualTo(String value) {
            addCriterion("DICOM_MD5 >=", value, "dicomMd5");
            return (Criteria) this;
        }

        public Criteria andDicomMd5LessThan(String value) {
            addCriterion("DICOM_MD5 <", value, "dicomMd5");
            return (Criteria) this;
        }

        public Criteria andDicomMd5LessThanOrEqualTo(String value) {
            addCriterion("DICOM_MD5 <=", value, "dicomMd5");
            return (Criteria) this;
        }

        public Criteria andDicomMd5Like(String value) {
            addCriterion("DICOM_MD5 like", value, "dicomMd5");
            return (Criteria) this;
        }

        public Criteria andDicomMd5NotLike(String value) {
            addCriterion("DICOM_MD5 not like", value, "dicomMd5");
            return (Criteria) this;
        }

        public Criteria andDicomMd5In(List<String> values) {
            addCriterion("DICOM_MD5 in", values, "dicomMd5");
            return (Criteria) this;
        }

        public Criteria andDicomMd5NotIn(List<String> values) {
            addCriterion("DICOM_MD5 not in", values, "dicomMd5");
            return (Criteria) this;
        }

        public Criteria andDicomMd5Between(String value1, String value2) {
            addCriterion("DICOM_MD5 between", value1, value2, "dicomMd5");
            return (Criteria) this;
        }

        public Criteria andDicomMd5NotBetween(String value1, String value2) {
            addCriterion("DICOM_MD5 not between", value1, value2, "dicomMd5");
            return (Criteria) this;
        }

        public Criteria andInstanceNumberIsNull() {
            addCriterion("INSTANCE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andInstanceNumberIsNotNull() {
            addCriterion("INSTANCE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andInstanceNumberEqualTo(String value) {
            addCriterion("INSTANCE_NUMBER =", value, "instanceNumber");
            return (Criteria) this;
        }

        public Criteria andInstanceNumberNotEqualTo(String value) {
            addCriterion("INSTANCE_NUMBER <>", value, "instanceNumber");
            return (Criteria) this;
        }

        public Criteria andInstanceNumberGreaterThan(String value) {
            addCriterion("INSTANCE_NUMBER >", value, "instanceNumber");
            return (Criteria) this;
        }

        public Criteria andInstanceNumberGreaterThanOrEqualTo(String value) {
            addCriterion("INSTANCE_NUMBER >=", value, "instanceNumber");
            return (Criteria) this;
        }

        public Criteria andInstanceNumberLessThan(String value) {
            addCriterion("INSTANCE_NUMBER <", value, "instanceNumber");
            return (Criteria) this;
        }

        public Criteria andInstanceNumberLessThanOrEqualTo(String value) {
            addCriterion("INSTANCE_NUMBER <=", value, "instanceNumber");
            return (Criteria) this;
        }

        public Criteria andInstanceNumberLike(String value) {
            addCriterion("INSTANCE_NUMBER like", value, "instanceNumber");
            return (Criteria) this;
        }

        public Criteria andInstanceNumberNotLike(String value) {
            addCriterion("INSTANCE_NUMBER not like", value, "instanceNumber");
            return (Criteria) this;
        }

        public Criteria andInstanceNumberIn(List<String> values) {
            addCriterion("INSTANCE_NUMBER in", values, "instanceNumber");
            return (Criteria) this;
        }

        public Criteria andInstanceNumberNotIn(List<String> values) {
            addCriterion("INSTANCE_NUMBER not in", values, "instanceNumber");
            return (Criteria) this;
        }

        public Criteria andInstanceNumberBetween(String value1, String value2) {
            addCriterion("INSTANCE_NUMBER between", value1, value2, "instanceNumber");
            return (Criteria) this;
        }

        public Criteria andInstanceNumberNotBetween(String value1, String value2) {
            addCriterion("INSTANCE_NUMBER not between", value1, value2, "instanceNumber");
            return (Criteria) this;
        }

        public Criteria andSeriesIdIsNull() {
            addCriterion("SERIES_ID is null");
            return (Criteria) this;
        }

        public Criteria andSeriesIdIsNotNull() {
            addCriterion("SERIES_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesIdEqualTo(Integer value) {
            addCriterion("SERIES_ID =", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotEqualTo(Integer value) {
            addCriterion("SERIES_ID <>", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdGreaterThan(Integer value) {
            addCriterion("SERIES_ID >", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SERIES_ID >=", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdLessThan(Integer value) {
            addCriterion("SERIES_ID <", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdLessThanOrEqualTo(Integer value) {
            addCriterion("SERIES_ID <=", value, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdIn(List<Integer> values) {
            addCriterion("SERIES_ID in", values, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotIn(List<Integer> values) {
            addCriterion("SERIES_ID not in", values, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdBetween(Integer value1, Integer value2) {
            addCriterion("SERIES_ID between", value1, value2, "seriesId");
            return (Criteria) this;
        }

        public Criteria andSeriesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SERIES_ID not between", value1, value2, "seriesId");
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