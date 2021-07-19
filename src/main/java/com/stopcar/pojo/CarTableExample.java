package com.stopcar.pojo;

import java.util.ArrayList;
import java.util.List;

public class CarTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarTableExample() {
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

        public Criteria andCarIdIsNull() {
            addCriterion("car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(Integer value) {
            addCriterion("car_id =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(Integer value) {
            addCriterion("car_id <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(Integer value) {
            addCriterion("car_id >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_id >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(Integer value) {
            addCriterion("car_id <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(Integer value) {
            addCriterion("car_id <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<Integer> values) {
            addCriterion("car_id in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<Integer> values) {
            addCriterion("car_id not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(Integer value1, Integer value2) {
            addCriterion("car_id between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(Integer value1, Integer value2) {
            addCriterion("car_id not between", value1, value2, "carId");
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

        public Criteria andCarStateIsNull() {
            addCriterion("car_state is null");
            return (Criteria) this;
        }

        public Criteria andCarStateIsNotNull() {
            addCriterion("car_state is not null");
            return (Criteria) this;
        }

        public Criteria andCarStateEqualTo(String value) {
            addCriterion("car_state =", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateNotEqualTo(String value) {
            addCriterion("car_state <>", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateGreaterThan(String value) {
            addCriterion("car_state >", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateGreaterThanOrEqualTo(String value) {
            addCriterion("car_state >=", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateLessThan(String value) {
            addCriterion("car_state <", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateLessThanOrEqualTo(String value) {
            addCriterion("car_state <=", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateLike(String value) {
            addCriterion("car_state like", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateNotLike(String value) {
            addCriterion("car_state not like", value, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateIn(List<String> values) {
            addCriterion("car_state in", values, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateNotIn(List<String> values) {
            addCriterion("car_state not in", values, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateBetween(String value1, String value2) {
            addCriterion("car_state between", value1, value2, "carState");
            return (Criteria) this;
        }

        public Criteria andCarStateNotBetween(String value1, String value2) {
            addCriterion("car_state not between", value1, value2, "carState");
            return (Criteria) this;
        }

        public Criteria andCarTimeIsNull() {
            addCriterion("car_time is null");
            return (Criteria) this;
        }

        public Criteria andCarTimeIsNotNull() {
            addCriterion("car_time is not null");
            return (Criteria) this;
        }

        public Criteria andCarTimeEqualTo(String value) {
            addCriterion("car_time =", value, "carTime");
            return (Criteria) this;
        }

        public Criteria andCarTimeNotEqualTo(String value) {
            addCriterion("car_time <>", value, "carTime");
            return (Criteria) this;
        }

        public Criteria andCarTimeGreaterThan(String value) {
            addCriterion("car_time >", value, "carTime");
            return (Criteria) this;
        }

        public Criteria andCarTimeGreaterThanOrEqualTo(String value) {
            addCriterion("car_time >=", value, "carTime");
            return (Criteria) this;
        }

        public Criteria andCarTimeLessThan(String value) {
            addCriterion("car_time <", value, "carTime");
            return (Criteria) this;
        }

        public Criteria andCarTimeLessThanOrEqualTo(String value) {
            addCriterion("car_time <=", value, "carTime");
            return (Criteria) this;
        }

        public Criteria andCarTimeLike(String value) {
            addCriterion("car_time like", value, "carTime");
            return (Criteria) this;
        }

        public Criteria andCarTimeNotLike(String value) {
            addCriterion("car_time not like", value, "carTime");
            return (Criteria) this;
        }

        public Criteria andCarTimeIn(List<String> values) {
            addCriterion("car_time in", values, "carTime");
            return (Criteria) this;
        }

        public Criteria andCarTimeNotIn(List<String> values) {
            addCriterion("car_time not in", values, "carTime");
            return (Criteria) this;
        }

        public Criteria andCarTimeBetween(String value1, String value2) {
            addCriterion("car_time between", value1, value2, "carTime");
            return (Criteria) this;
        }

        public Criteria andCarTimeNotBetween(String value1, String value2) {
            addCriterion("car_time not between", value1, value2, "carTime");
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