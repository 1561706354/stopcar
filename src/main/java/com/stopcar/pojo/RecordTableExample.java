package com.stopcar.pojo;

import java.util.ArrayList;
import java.util.List;

public class RecordTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecordTableExample() {
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

        public Criteria andRecordIdIsNull() {
            addCriterion("record_id is null");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNotNull() {
            addCriterion("record_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecordIdEqualTo(Integer value) {
            addCriterion("record_id =", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotEqualTo(Integer value) {
            addCriterion("record_id <>", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThan(Integer value) {
            addCriterion("record_id >", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_id >=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThan(Integer value) {
            addCriterion("record_id <", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("record_id <=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdIn(List<Integer> values) {
            addCriterion("record_id in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotIn(List<Integer> values) {
            addCriterion("record_id not in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("record_id between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("record_id not between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordNumIsNull() {
            addCriterion("record_num is null");
            return (Criteria) this;
        }

        public Criteria andRecordNumIsNotNull() {
            addCriterion("record_num is not null");
            return (Criteria) this;
        }

        public Criteria andRecordNumEqualTo(String value) {
            addCriterion("record_num =", value, "recordNum");
            return (Criteria) this;
        }

        public Criteria andRecordNumNotEqualTo(String value) {
            addCriterion("record_num <>", value, "recordNum");
            return (Criteria) this;
        }

        public Criteria andRecordNumGreaterThan(String value) {
            addCriterion("record_num >", value, "recordNum");
            return (Criteria) this;
        }

        public Criteria andRecordNumGreaterThanOrEqualTo(String value) {
            addCriterion("record_num >=", value, "recordNum");
            return (Criteria) this;
        }

        public Criteria andRecordNumLessThan(String value) {
            addCriterion("record_num <", value, "recordNum");
            return (Criteria) this;
        }

        public Criteria andRecordNumLessThanOrEqualTo(String value) {
            addCriterion("record_num <=", value, "recordNum");
            return (Criteria) this;
        }

        public Criteria andRecordNumLike(String value) {
            addCriterion("record_num like", value, "recordNum");
            return (Criteria) this;
        }

        public Criteria andRecordNumNotLike(String value) {
            addCriterion("record_num not like", value, "recordNum");
            return (Criteria) this;
        }

        public Criteria andRecordNumIn(List<String> values) {
            addCriterion("record_num in", values, "recordNum");
            return (Criteria) this;
        }

        public Criteria andRecordNumNotIn(List<String> values) {
            addCriterion("record_num not in", values, "recordNum");
            return (Criteria) this;
        }

        public Criteria andRecordNumBetween(String value1, String value2) {
            addCriterion("record_num between", value1, value2, "recordNum");
            return (Criteria) this;
        }

        public Criteria andRecordNumNotBetween(String value1, String value2) {
            addCriterion("record_num not between", value1, value2, "recordNum");
            return (Criteria) this;
        }

        public Criteria andRecordGotimeIsNull() {
            addCriterion("record_gotime is null");
            return (Criteria) this;
        }

        public Criteria andRecordGotimeIsNotNull() {
            addCriterion("record_gotime is not null");
            return (Criteria) this;
        }

        public Criteria andRecordGotimeEqualTo(String value) {
            addCriterion("record_gotime =", value, "recordGotime");
            return (Criteria) this;
        }

        public Criteria andRecordGotimeNotEqualTo(String value) {
            addCriterion("record_gotime <>", value, "recordGotime");
            return (Criteria) this;
        }

        public Criteria andRecordGotimeGreaterThan(String value) {
            addCriterion("record_gotime >", value, "recordGotime");
            return (Criteria) this;
        }

        public Criteria andRecordGotimeGreaterThanOrEqualTo(String value) {
            addCriterion("record_gotime >=", value, "recordGotime");
            return (Criteria) this;
        }

        public Criteria andRecordGotimeLessThan(String value) {
            addCriterion("record_gotime <", value, "recordGotime");
            return (Criteria) this;
        }

        public Criteria andRecordGotimeLessThanOrEqualTo(String value) {
            addCriterion("record_gotime <=", value, "recordGotime");
            return (Criteria) this;
        }

        public Criteria andRecordGotimeLike(String value) {
            addCriterion("record_gotime like", value, "recordGotime");
            return (Criteria) this;
        }

        public Criteria andRecordGotimeNotLike(String value) {
            addCriterion("record_gotime not like", value, "recordGotime");
            return (Criteria) this;
        }

        public Criteria andRecordGotimeIn(List<String> values) {
            addCriterion("record_gotime in", values, "recordGotime");
            return (Criteria) this;
        }

        public Criteria andRecordGotimeNotIn(List<String> values) {
            addCriterion("record_gotime not in", values, "recordGotime");
            return (Criteria) this;
        }

        public Criteria andRecordGotimeBetween(String value1, String value2) {
            addCriterion("record_gotime between", value1, value2, "recordGotime");
            return (Criteria) this;
        }

        public Criteria andRecordGotimeNotBetween(String value1, String value2) {
            addCriterion("record_gotime not between", value1, value2, "recordGotime");
            return (Criteria) this;
        }

        public Criteria andRecordLvtimeIsNull() {
            addCriterion("record_lvtime is null");
            return (Criteria) this;
        }

        public Criteria andRecordLvtimeIsNotNull() {
            addCriterion("record_lvtime is not null");
            return (Criteria) this;
        }

        public Criteria andRecordLvtimeEqualTo(String value) {
            addCriterion("record_lvtime =", value, "recordLvtime");
            return (Criteria) this;
        }

        public Criteria andRecordLvtimeNotEqualTo(String value) {
            addCriterion("record_lvtime <>", value, "recordLvtime");
            return (Criteria) this;
        }

        public Criteria andRecordLvtimeGreaterThan(String value) {
            addCriterion("record_lvtime >", value, "recordLvtime");
            return (Criteria) this;
        }

        public Criteria andRecordLvtimeGreaterThanOrEqualTo(String value) {
            addCriterion("record_lvtime >=", value, "recordLvtime");
            return (Criteria) this;
        }

        public Criteria andRecordLvtimeLessThan(String value) {
            addCriterion("record_lvtime <", value, "recordLvtime");
            return (Criteria) this;
        }

        public Criteria andRecordLvtimeLessThanOrEqualTo(String value) {
            addCriterion("record_lvtime <=", value, "recordLvtime");
            return (Criteria) this;
        }

        public Criteria andRecordLvtimeLike(String value) {
            addCriterion("record_lvtime like", value, "recordLvtime");
            return (Criteria) this;
        }

        public Criteria andRecordLvtimeNotLike(String value) {
            addCriterion("record_lvtime not like", value, "recordLvtime");
            return (Criteria) this;
        }

        public Criteria andRecordLvtimeIn(List<String> values) {
            addCriterion("record_lvtime in", values, "recordLvtime");
            return (Criteria) this;
        }

        public Criteria andRecordLvtimeNotIn(List<String> values) {
            addCriterion("record_lvtime not in", values, "recordLvtime");
            return (Criteria) this;
        }

        public Criteria andRecordLvtimeBetween(String value1, String value2) {
            addCriterion("record_lvtime between", value1, value2, "recordLvtime");
            return (Criteria) this;
        }

        public Criteria andRecordLvtimeNotBetween(String value1, String value2) {
            addCriterion("record_lvtime not between", value1, value2, "recordLvtime");
            return (Criteria) this;
        }

        public Criteria andAccessTypeIsNull() {
            addCriterion("access_type is null");
            return (Criteria) this;
        }

        public Criteria andAccessTypeIsNotNull() {
            addCriterion("access_type is not null");
            return (Criteria) this;
        }

        public Criteria andAccessTypeEqualTo(String value) {
            addCriterion("access_type =", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeNotEqualTo(String value) {
            addCriterion("access_type <>", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeGreaterThan(String value) {
            addCriterion("access_type >", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("access_type >=", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeLessThan(String value) {
            addCriterion("access_type <", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeLessThanOrEqualTo(String value) {
            addCriterion("access_type <=", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeLike(String value) {
            addCriterion("access_type like", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeNotLike(String value) {
            addCriterion("access_type not like", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeIn(List<String> values) {
            addCriterion("access_type in", values, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeNotIn(List<String> values) {
            addCriterion("access_type not in", values, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeBetween(String value1, String value2) {
            addCriterion("access_type between", value1, value2, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeNotBetween(String value1, String value2) {
            addCriterion("access_type not between", value1, value2, "accessType");
            return (Criteria) this;
        }

        public Criteria andRecordCostIsNull() {
            addCriterion("record_cost is null");
            return (Criteria) this;
        }

        public Criteria andRecordCostIsNotNull() {
            addCriterion("record_cost is not null");
            return (Criteria) this;
        }

        public Criteria andRecordCostEqualTo(Integer value) {
            addCriterion("record_cost =", value, "recordCost");
            return (Criteria) this;
        }

        public Criteria andRecordCostNotEqualTo(Integer value) {
            addCriterion("record_cost <>", value, "recordCost");
            return (Criteria) this;
        }

        public Criteria andRecordCostGreaterThan(Integer value) {
            addCriterion("record_cost >", value, "recordCost");
            return (Criteria) this;
        }

        public Criteria andRecordCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_cost >=", value, "recordCost");
            return (Criteria) this;
        }

        public Criteria andRecordCostLessThan(Integer value) {
            addCriterion("record_cost <", value, "recordCost");
            return (Criteria) this;
        }

        public Criteria andRecordCostLessThanOrEqualTo(Integer value) {
            addCriterion("record_cost <=", value, "recordCost");
            return (Criteria) this;
        }

        public Criteria andRecordCostIn(List<Integer> values) {
            addCriterion("record_cost in", values, "recordCost");
            return (Criteria) this;
        }

        public Criteria andRecordCostNotIn(List<Integer> values) {
            addCriterion("record_cost not in", values, "recordCost");
            return (Criteria) this;
        }

        public Criteria andRecordCostBetween(Integer value1, Integer value2) {
            addCriterion("record_cost between", value1, value2, "recordCost");
            return (Criteria) this;
        }

        public Criteria andRecordCostNotBetween(Integer value1, Integer value2) {
            addCriterion("record_cost not between", value1, value2, "recordCost");
            return (Criteria) this;
        }

        public Criteria andCarPortIsNull() {
            addCriterion("car_port is null");
            return (Criteria) this;
        }

        public Criteria andCarPortIsNotNull() {
            addCriterion("car_port is not null");
            return (Criteria) this;
        }

        public Criteria andCarPortEqualTo(String value) {
            addCriterion("car_port =", value, "carPort");
            return (Criteria) this;
        }

        public Criteria andCarPortNotEqualTo(String value) {
            addCriterion("car_port <>", value, "carPort");
            return (Criteria) this;
        }

        public Criteria andCarPortGreaterThan(String value) {
            addCriterion("car_port >", value, "carPort");
            return (Criteria) this;
        }

        public Criteria andCarPortGreaterThanOrEqualTo(String value) {
            addCriterion("car_port >=", value, "carPort");
            return (Criteria) this;
        }

        public Criteria andCarPortLessThan(String value) {
            addCriterion("car_port <", value, "carPort");
            return (Criteria) this;
        }

        public Criteria andCarPortLessThanOrEqualTo(String value) {
            addCriterion("car_port <=", value, "carPort");
            return (Criteria) this;
        }

        public Criteria andCarPortLike(String value) {
            addCriterion("car_port like", value, "carPort");
            return (Criteria) this;
        }

        public Criteria andCarPortNotLike(String value) {
            addCriterion("car_port not like", value, "carPort");
            return (Criteria) this;
        }

        public Criteria andCarPortIn(List<String> values) {
            addCriterion("car_port in", values, "carPort");
            return (Criteria) this;
        }

        public Criteria andCarPortNotIn(List<String> values) {
            addCriterion("car_port not in", values, "carPort");
            return (Criteria) this;
        }

        public Criteria andCarPortBetween(String value1, String value2) {
            addCriterion("car_port between", value1, value2, "carPort");
            return (Criteria) this;
        }

        public Criteria andCarPortNotBetween(String value1, String value2) {
            addCriterion("car_port not between", value1, value2, "carPort");
            return (Criteria) this;
        }

        public Criteria andRecordStartIsNull() {
            addCriterion("record_start is null");
            return (Criteria) this;
        }

        public Criteria andRecordStartIsNotNull() {
            addCriterion("record_start is not null");
            return (Criteria) this;
        }

        public Criteria andRecordStartEqualTo(String value) {
            addCriterion("record_start =", value, "recordStart");
            return (Criteria) this;
        }

        public Criteria andRecordStartNotEqualTo(String value) {
            addCriterion("record_start <>", value, "recordStart");
            return (Criteria) this;
        }

        public Criteria andRecordStartGreaterThan(String value) {
            addCriterion("record_start >", value, "recordStart");
            return (Criteria) this;
        }

        public Criteria andRecordStartGreaterThanOrEqualTo(String value) {
            addCriterion("record_start >=", value, "recordStart");
            return (Criteria) this;
        }

        public Criteria andRecordStartLessThan(String value) {
            addCriterion("record_start <", value, "recordStart");
            return (Criteria) this;
        }

        public Criteria andRecordStartLessThanOrEqualTo(String value) {
            addCriterion("record_start <=", value, "recordStart");
            return (Criteria) this;
        }

        public Criteria andRecordStartLike(String value) {
            addCriterion("record_start like", value, "recordStart");
            return (Criteria) this;
        }

        public Criteria andRecordStartNotLike(String value) {
            addCriterion("record_start not like", value, "recordStart");
            return (Criteria) this;
        }

        public Criteria andRecordStartIn(List<String> values) {
            addCriterion("record_start in", values, "recordStart");
            return (Criteria) this;
        }

        public Criteria andRecordStartNotIn(List<String> values) {
            addCriterion("record_start not in", values, "recordStart");
            return (Criteria) this;
        }

        public Criteria andRecordStartBetween(String value1, String value2) {
            addCriterion("record_start between", value1, value2, "recordStart");
            return (Criteria) this;
        }

        public Criteria andRecordStartNotBetween(String value1, String value2) {
            addCriterion("record_start not between", value1, value2, "recordStart");
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