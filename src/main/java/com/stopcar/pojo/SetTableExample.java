package com.stopcar.pojo;

import java.util.ArrayList;
import java.util.List;

public class SetTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SetTableExample() {
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

        public Criteria andSetIdIsNull() {
            addCriterion("set_id is null");
            return (Criteria) this;
        }

        public Criteria andSetIdIsNotNull() {
            addCriterion("set_id is not null");
            return (Criteria) this;
        }

        public Criteria andSetIdEqualTo(Integer value) {
            addCriterion("set_id =", value, "setId");
            return (Criteria) this;
        }

        public Criteria andSetIdNotEqualTo(Integer value) {
            addCriterion("set_id <>", value, "setId");
            return (Criteria) this;
        }

        public Criteria andSetIdGreaterThan(Integer value) {
            addCriterion("set_id >", value, "setId");
            return (Criteria) this;
        }

        public Criteria andSetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("set_id >=", value, "setId");
            return (Criteria) this;
        }

        public Criteria andSetIdLessThan(Integer value) {
            addCriterion("set_id <", value, "setId");
            return (Criteria) this;
        }

        public Criteria andSetIdLessThanOrEqualTo(Integer value) {
            addCriterion("set_id <=", value, "setId");
            return (Criteria) this;
        }

        public Criteria andSetIdIn(List<Integer> values) {
            addCriterion("set_id in", values, "setId");
            return (Criteria) this;
        }

        public Criteria andSetIdNotIn(List<Integer> values) {
            addCriterion("set_id not in", values, "setId");
            return (Criteria) this;
        }

        public Criteria andSetIdBetween(Integer value1, Integer value2) {
            addCriterion("set_id between", value1, value2, "setId");
            return (Criteria) this;
        }

        public Criteria andSetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("set_id not between", value1, value2, "setId");
            return (Criteria) this;
        }

        public Criteria andSetNameIsNull() {
            addCriterion("set_name is null");
            return (Criteria) this;
        }

        public Criteria andSetNameIsNotNull() {
            addCriterion("set_name is not null");
            return (Criteria) this;
        }

        public Criteria andSetNameEqualTo(String value) {
            addCriterion("set_name =", value, "setName");
            return (Criteria) this;
        }

        public Criteria andSetNameNotEqualTo(String value) {
            addCriterion("set_name <>", value, "setName");
            return (Criteria) this;
        }

        public Criteria andSetNameGreaterThan(String value) {
            addCriterion("set_name >", value, "setName");
            return (Criteria) this;
        }

        public Criteria andSetNameGreaterThanOrEqualTo(String value) {
            addCriterion("set_name >=", value, "setName");
            return (Criteria) this;
        }

        public Criteria andSetNameLessThan(String value) {
            addCriterion("set_name <", value, "setName");
            return (Criteria) this;
        }

        public Criteria andSetNameLessThanOrEqualTo(String value) {
            addCriterion("set_name <=", value, "setName");
            return (Criteria) this;
        }

        public Criteria andSetNameLike(String value) {
            addCriterion("set_name like", value, "setName");
            return (Criteria) this;
        }

        public Criteria andSetNameNotLike(String value) {
            addCriterion("set_name not like", value, "setName");
            return (Criteria) this;
        }

        public Criteria andSetNameIn(List<String> values) {
            addCriterion("set_name in", values, "setName");
            return (Criteria) this;
        }

        public Criteria andSetNameNotIn(List<String> values) {
            addCriterion("set_name not in", values, "setName");
            return (Criteria) this;
        }

        public Criteria andSetNameBetween(String value1, String value2) {
            addCriterion("set_name between", value1, value2, "setName");
            return (Criteria) this;
        }

        public Criteria andSetNameNotBetween(String value1, String value2) {
            addCriterion("set_name not between", value1, value2, "setName");
            return (Criteria) this;
        }

        public Criteria andSetPwdIsNull() {
            addCriterion("set_pwd is null");
            return (Criteria) this;
        }

        public Criteria andSetPwdIsNotNull() {
            addCriterion("set_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andSetPwdEqualTo(String value) {
            addCriterion("set_pwd =", value, "setPwd");
            return (Criteria) this;
        }

        public Criteria andSetPwdNotEqualTo(String value) {
            addCriterion("set_pwd <>", value, "setPwd");
            return (Criteria) this;
        }

        public Criteria andSetPwdGreaterThan(String value) {
            addCriterion("set_pwd >", value, "setPwd");
            return (Criteria) this;
        }

        public Criteria andSetPwdGreaterThanOrEqualTo(String value) {
            addCriterion("set_pwd >=", value, "setPwd");
            return (Criteria) this;
        }

        public Criteria andSetPwdLessThan(String value) {
            addCriterion("set_pwd <", value, "setPwd");
            return (Criteria) this;
        }

        public Criteria andSetPwdLessThanOrEqualTo(String value) {
            addCriterion("set_pwd <=", value, "setPwd");
            return (Criteria) this;
        }

        public Criteria andSetPwdLike(String value) {
            addCriterion("set_pwd like", value, "setPwd");
            return (Criteria) this;
        }

        public Criteria andSetPwdNotLike(String value) {
            addCriterion("set_pwd not like", value, "setPwd");
            return (Criteria) this;
        }

        public Criteria andSetPwdIn(List<String> values) {
            addCriterion("set_pwd in", values, "setPwd");
            return (Criteria) this;
        }

        public Criteria andSetPwdNotIn(List<String> values) {
            addCriterion("set_pwd not in", values, "setPwd");
            return (Criteria) this;
        }

        public Criteria andSetPwdBetween(String value1, String value2) {
            addCriterion("set_pwd between", value1, value2, "setPwd");
            return (Criteria) this;
        }

        public Criteria andSetPwdNotBetween(String value1, String value2) {
            addCriterion("set_pwd not between", value1, value2, "setPwd");
            return (Criteria) this;
        }

        public Criteria andSetPriceIsNull() {
            addCriterion("set_price is null");
            return (Criteria) this;
        }

        public Criteria andSetPriceIsNotNull() {
            addCriterion("set_price is not null");
            return (Criteria) this;
        }

        public Criteria andSetPriceEqualTo(Integer value) {
            addCriterion("set_price =", value, "setPrice");
            return (Criteria) this;
        }

        public Criteria andSetPriceNotEqualTo(Integer value) {
            addCriterion("set_price <>", value, "setPrice");
            return (Criteria) this;
        }

        public Criteria andSetPriceGreaterThan(Integer value) {
            addCriterion("set_price >", value, "setPrice");
            return (Criteria) this;
        }

        public Criteria andSetPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("set_price >=", value, "setPrice");
            return (Criteria) this;
        }

        public Criteria andSetPriceLessThan(Integer value) {
            addCriterion("set_price <", value, "setPrice");
            return (Criteria) this;
        }

        public Criteria andSetPriceLessThanOrEqualTo(Integer value) {
            addCriterion("set_price <=", value, "setPrice");
            return (Criteria) this;
        }

        public Criteria andSetPriceIn(List<Integer> values) {
            addCriterion("set_price in", values, "setPrice");
            return (Criteria) this;
        }

        public Criteria andSetPriceNotIn(List<Integer> values) {
            addCriterion("set_price not in", values, "setPrice");
            return (Criteria) this;
        }

        public Criteria andSetPriceBetween(Integer value1, Integer value2) {
            addCriterion("set_price between", value1, value2, "setPrice");
            return (Criteria) this;
        }

        public Criteria andSetPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("set_price not between", value1, value2, "setPrice");
            return (Criteria) this;
        }

        public Criteria andSetMonthIsNull() {
            addCriterion("set_month is null");
            return (Criteria) this;
        }

        public Criteria andSetMonthIsNotNull() {
            addCriterion("set_month is not null");
            return (Criteria) this;
        }

        public Criteria andSetMonthEqualTo(Long value) {
            addCriterion("set_month =", value, "setMonth");
            return (Criteria) this;
        }

        public Criteria andSetMonthNotEqualTo(Long value) {
            addCriterion("set_month <>", value, "setMonth");
            return (Criteria) this;
        }

        public Criteria andSetMonthGreaterThan(Long value) {
            addCriterion("set_month >", value, "setMonth");
            return (Criteria) this;
        }

        public Criteria andSetMonthGreaterThanOrEqualTo(Long value) {
            addCriterion("set_month >=", value, "setMonth");
            return (Criteria) this;
        }

        public Criteria andSetMonthLessThan(Long value) {
            addCriterion("set_month <", value, "setMonth");
            return (Criteria) this;
        }

        public Criteria andSetMonthLessThanOrEqualTo(Long value) {
            addCriterion("set_month <=", value, "setMonth");
            return (Criteria) this;
        }

        public Criteria andSetMonthIn(List<Long> values) {
            addCriterion("set_month in", values, "setMonth");
            return (Criteria) this;
        }

        public Criteria andSetMonthNotIn(List<Long> values) {
            addCriterion("set_month not in", values, "setMonth");
            return (Criteria) this;
        }

        public Criteria andSetMonthBetween(Long value1, Long value2) {
            addCriterion("set_month between", value1, value2, "setMonth");
            return (Criteria) this;
        }

        public Criteria andSetMonthNotBetween(Long value1, Long value2) {
            addCriterion("set_month not between", value1, value2, "setMonth");
            return (Criteria) this;
        }

        public Criteria andSetYearIsNull() {
            addCriterion("set_year is null");
            return (Criteria) this;
        }

        public Criteria andSetYearIsNotNull() {
            addCriterion("set_year is not null");
            return (Criteria) this;
        }

        public Criteria andSetYearEqualTo(Long value) {
            addCriterion("set_year =", value, "setYear");
            return (Criteria) this;
        }

        public Criteria andSetYearNotEqualTo(Long value) {
            addCriterion("set_year <>", value, "setYear");
            return (Criteria) this;
        }

        public Criteria andSetYearGreaterThan(Long value) {
            addCriterion("set_year >", value, "setYear");
            return (Criteria) this;
        }

        public Criteria andSetYearGreaterThanOrEqualTo(Long value) {
            addCriterion("set_year >=", value, "setYear");
            return (Criteria) this;
        }

        public Criteria andSetYearLessThan(Long value) {
            addCriterion("set_year <", value, "setYear");
            return (Criteria) this;
        }

        public Criteria andSetYearLessThanOrEqualTo(Long value) {
            addCriterion("set_year <=", value, "setYear");
            return (Criteria) this;
        }

        public Criteria andSetYearIn(List<Long> values) {
            addCriterion("set_year in", values, "setYear");
            return (Criteria) this;
        }

        public Criteria andSetYearNotIn(List<Long> values) {
            addCriterion("set_year not in", values, "setYear");
            return (Criteria) this;
        }

        public Criteria andSetYearBetween(Long value1, Long value2) {
            addCriterion("set_year between", value1, value2, "setYear");
            return (Criteria) this;
        }

        public Criteria andSetYearNotBetween(Long value1, Long value2) {
            addCriterion("set_year not between", value1, value2, "setYear");
            return (Criteria) this;
        }

        public Criteria andSetTypeIsNull() {
            addCriterion("set_type is null");
            return (Criteria) this;
        }

        public Criteria andSetTypeIsNotNull() {
            addCriterion("set_type is not null");
            return (Criteria) this;
        }

        public Criteria andSetTypeEqualTo(String value) {
            addCriterion("set_type =", value, "setType");
            return (Criteria) this;
        }

        public Criteria andSetTypeNotEqualTo(String value) {
            addCriterion("set_type <>", value, "setType");
            return (Criteria) this;
        }

        public Criteria andSetTypeGreaterThan(String value) {
            addCriterion("set_type >", value, "setType");
            return (Criteria) this;
        }

        public Criteria andSetTypeGreaterThanOrEqualTo(String value) {
            addCriterion("set_type >=", value, "setType");
            return (Criteria) this;
        }

        public Criteria andSetTypeLessThan(String value) {
            addCriterion("set_type <", value, "setType");
            return (Criteria) this;
        }

        public Criteria andSetTypeLessThanOrEqualTo(String value) {
            addCriterion("set_type <=", value, "setType");
            return (Criteria) this;
        }

        public Criteria andSetTypeLike(String value) {
            addCriterion("set_type like", value, "setType");
            return (Criteria) this;
        }

        public Criteria andSetTypeNotLike(String value) {
            addCriterion("set_type not like", value, "setType");
            return (Criteria) this;
        }

        public Criteria andSetTypeIn(List<String> values) {
            addCriterion("set_type in", values, "setType");
            return (Criteria) this;
        }

        public Criteria andSetTypeNotIn(List<String> values) {
            addCriterion("set_type not in", values, "setType");
            return (Criteria) this;
        }

        public Criteria andSetTypeBetween(String value1, String value2) {
            addCriterion("set_type between", value1, value2, "setType");
            return (Criteria) this;
        }

        public Criteria andSetTypeNotBetween(String value1, String value2) {
            addCriterion("set_type not between", value1, value2, "setType");
            return (Criteria) this;
        }

        public Criteria andSetTimeIsNull() {
            addCriterion("set_time is null");
            return (Criteria) this;
        }

        public Criteria andSetTimeIsNotNull() {
            addCriterion("set_time is not null");
            return (Criteria) this;
        }

        public Criteria andSetTimeEqualTo(String value) {
            addCriterion("set_time =", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeNotEqualTo(String value) {
            addCriterion("set_time <>", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeGreaterThan(String value) {
            addCriterion("set_time >", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeGreaterThanOrEqualTo(String value) {
            addCriterion("set_time >=", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeLessThan(String value) {
            addCriterion("set_time <", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeLessThanOrEqualTo(String value) {
            addCriterion("set_time <=", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeLike(String value) {
            addCriterion("set_time like", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeNotLike(String value) {
            addCriterion("set_time not like", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeIn(List<String> values) {
            addCriterion("set_time in", values, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeNotIn(List<String> values) {
            addCriterion("set_time not in", values, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeBetween(String value1, String value2) {
            addCriterion("set_time between", value1, value2, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeNotBetween(String value1, String value2) {
            addCriterion("set_time not between", value1, value2, "setTime");
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