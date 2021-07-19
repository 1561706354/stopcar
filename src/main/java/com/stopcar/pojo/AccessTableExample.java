package com.stopcar.pojo;

import java.util.ArrayList;
import java.util.List;

public class AccessTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccessTableExample() {
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

        public Criteria andAccessIdIsNull() {
            addCriterion("access_id is null");
            return (Criteria) this;
        }

        public Criteria andAccessIdIsNotNull() {
            addCriterion("access_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccessIdEqualTo(Integer value) {
            addCriterion("access_id =", value, "accessId");
            return (Criteria) this;
        }

        public Criteria andAccessIdNotEqualTo(Integer value) {
            addCriterion("access_id <>", value, "accessId");
            return (Criteria) this;
        }

        public Criteria andAccessIdGreaterThan(Integer value) {
            addCriterion("access_id >", value, "accessId");
            return (Criteria) this;
        }

        public Criteria andAccessIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("access_id >=", value, "accessId");
            return (Criteria) this;
        }

        public Criteria andAccessIdLessThan(Integer value) {
            addCriterion("access_id <", value, "accessId");
            return (Criteria) this;
        }

        public Criteria andAccessIdLessThanOrEqualTo(Integer value) {
            addCriterion("access_id <=", value, "accessId");
            return (Criteria) this;
        }

        public Criteria andAccessIdIn(List<Integer> values) {
            addCriterion("access_id in", values, "accessId");
            return (Criteria) this;
        }

        public Criteria andAccessIdNotIn(List<Integer> values) {
            addCriterion("access_id not in", values, "accessId");
            return (Criteria) this;
        }

        public Criteria andAccessIdBetween(Integer value1, Integer value2) {
            addCriterion("access_id between", value1, value2, "accessId");
            return (Criteria) this;
        }

        public Criteria andAccessIdNotBetween(Integer value1, Integer value2) {
            addCriterion("access_id not between", value1, value2, "accessId");
            return (Criteria) this;
        }

        public Criteria andAccessNameIsNull() {
            addCriterion("access_name is null");
            return (Criteria) this;
        }

        public Criteria andAccessNameIsNotNull() {
            addCriterion("access_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccessNameEqualTo(String value) {
            addCriterion("access_name =", value, "accessName");
            return (Criteria) this;
        }

        public Criteria andAccessNameNotEqualTo(String value) {
            addCriterion("access_name <>", value, "accessName");
            return (Criteria) this;
        }

        public Criteria andAccessNameGreaterThan(String value) {
            addCriterion("access_name >", value, "accessName");
            return (Criteria) this;
        }

        public Criteria andAccessNameGreaterThanOrEqualTo(String value) {
            addCriterion("access_name >=", value, "accessName");
            return (Criteria) this;
        }

        public Criteria andAccessNameLessThan(String value) {
            addCriterion("access_name <", value, "accessName");
            return (Criteria) this;
        }

        public Criteria andAccessNameLessThanOrEqualTo(String value) {
            addCriterion("access_name <=", value, "accessName");
            return (Criteria) this;
        }

        public Criteria andAccessNameLike(String value) {
            addCriterion("access_name like", value, "accessName");
            return (Criteria) this;
        }

        public Criteria andAccessNameNotLike(String value) {
            addCriterion("access_name not like", value, "accessName");
            return (Criteria) this;
        }

        public Criteria andAccessNameIn(List<String> values) {
            addCriterion("access_name in", values, "accessName");
            return (Criteria) this;
        }

        public Criteria andAccessNameNotIn(List<String> values) {
            addCriterion("access_name not in", values, "accessName");
            return (Criteria) this;
        }

        public Criteria andAccessNameBetween(String value1, String value2) {
            addCriterion("access_name between", value1, value2, "accessName");
            return (Criteria) this;
        }

        public Criteria andAccessNameNotBetween(String value1, String value2) {
            addCriterion("access_name not between", value1, value2, "accessName");
            return (Criteria) this;
        }

        public Criteria andAccessPhoneIsNull() {
            addCriterion("access_phone is null");
            return (Criteria) this;
        }

        public Criteria andAccessPhoneIsNotNull() {
            addCriterion("access_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAccessPhoneEqualTo(String value) {
            addCriterion("access_phone =", value, "accessPhone");
            return (Criteria) this;
        }

        public Criteria andAccessPhoneNotEqualTo(String value) {
            addCriterion("access_phone <>", value, "accessPhone");
            return (Criteria) this;
        }

        public Criteria andAccessPhoneGreaterThan(String value) {
            addCriterion("access_phone >", value, "accessPhone");
            return (Criteria) this;
        }

        public Criteria andAccessPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("access_phone >=", value, "accessPhone");
            return (Criteria) this;
        }

        public Criteria andAccessPhoneLessThan(String value) {
            addCriterion("access_phone <", value, "accessPhone");
            return (Criteria) this;
        }

        public Criteria andAccessPhoneLessThanOrEqualTo(String value) {
            addCriterion("access_phone <=", value, "accessPhone");
            return (Criteria) this;
        }

        public Criteria andAccessPhoneLike(String value) {
            addCriterion("access_phone like", value, "accessPhone");
            return (Criteria) this;
        }

        public Criteria andAccessPhoneNotLike(String value) {
            addCriterion("access_phone not like", value, "accessPhone");
            return (Criteria) this;
        }

        public Criteria andAccessPhoneIn(List<String> values) {
            addCriterion("access_phone in", values, "accessPhone");
            return (Criteria) this;
        }

        public Criteria andAccessPhoneNotIn(List<String> values) {
            addCriterion("access_phone not in", values, "accessPhone");
            return (Criteria) this;
        }

        public Criteria andAccessPhoneBetween(String value1, String value2) {
            addCriterion("access_phone between", value1, value2, "accessPhone");
            return (Criteria) this;
        }

        public Criteria andAccessPhoneNotBetween(String value1, String value2) {
            addCriterion("access_phone not between", value1, value2, "accessPhone");
            return (Criteria) this;
        }

        public Criteria andAccessNumIsNull() {
            addCriterion("access_num is null");
            return (Criteria) this;
        }

        public Criteria andAccessNumIsNotNull() {
            addCriterion("access_num is not null");
            return (Criteria) this;
        }

        public Criteria andAccessNumEqualTo(String value) {
            addCriterion("access_num =", value, "accessNum");
            return (Criteria) this;
        }

        public Criteria andAccessNumNotEqualTo(String value) {
            addCriterion("access_num <>", value, "accessNum");
            return (Criteria) this;
        }

        public Criteria andAccessNumGreaterThan(String value) {
            addCriterion("access_num >", value, "accessNum");
            return (Criteria) this;
        }

        public Criteria andAccessNumGreaterThanOrEqualTo(String value) {
            addCriterion("access_num >=", value, "accessNum");
            return (Criteria) this;
        }

        public Criteria andAccessNumLessThan(String value) {
            addCriterion("access_num <", value, "accessNum");
            return (Criteria) this;
        }

        public Criteria andAccessNumLessThanOrEqualTo(String value) {
            addCriterion("access_num <=", value, "accessNum");
            return (Criteria) this;
        }

        public Criteria andAccessNumLike(String value) {
            addCriterion("access_num like", value, "accessNum");
            return (Criteria) this;
        }

        public Criteria andAccessNumNotLike(String value) {
            addCriterion("access_num not like", value, "accessNum");
            return (Criteria) this;
        }

        public Criteria andAccessNumIn(List<String> values) {
            addCriterion("access_num in", values, "accessNum");
            return (Criteria) this;
        }

        public Criteria andAccessNumNotIn(List<String> values) {
            addCriterion("access_num not in", values, "accessNum");
            return (Criteria) this;
        }

        public Criteria andAccessNumBetween(String value1, String value2) {
            addCriterion("access_num between", value1, value2, "accessNum");
            return (Criteria) this;
        }

        public Criteria andAccessNumNotBetween(String value1, String value2) {
            addCriterion("access_num not between", value1, value2, "accessNum");
            return (Criteria) this;
        }

        public Criteria andAccessColorIsNull() {
            addCriterion("access_color is null");
            return (Criteria) this;
        }

        public Criteria andAccessColorIsNotNull() {
            addCriterion("access_color is not null");
            return (Criteria) this;
        }

        public Criteria andAccessColorEqualTo(String value) {
            addCriterion("access_color =", value, "accessColor");
            return (Criteria) this;
        }

        public Criteria andAccessColorNotEqualTo(String value) {
            addCriterion("access_color <>", value, "accessColor");
            return (Criteria) this;
        }

        public Criteria andAccessColorGreaterThan(String value) {
            addCriterion("access_color >", value, "accessColor");
            return (Criteria) this;
        }

        public Criteria andAccessColorGreaterThanOrEqualTo(String value) {
            addCriterion("access_color >=", value, "accessColor");
            return (Criteria) this;
        }

        public Criteria andAccessColorLessThan(String value) {
            addCriterion("access_color <", value, "accessColor");
            return (Criteria) this;
        }

        public Criteria andAccessColorLessThanOrEqualTo(String value) {
            addCriterion("access_color <=", value, "accessColor");
            return (Criteria) this;
        }

        public Criteria andAccessColorLike(String value) {
            addCriterion("access_color like", value, "accessColor");
            return (Criteria) this;
        }

        public Criteria andAccessColorNotLike(String value) {
            addCriterion("access_color not like", value, "accessColor");
            return (Criteria) this;
        }

        public Criteria andAccessColorIn(List<String> values) {
            addCriterion("access_color in", values, "accessColor");
            return (Criteria) this;
        }

        public Criteria andAccessColorNotIn(List<String> values) {
            addCriterion("access_color not in", values, "accessColor");
            return (Criteria) this;
        }

        public Criteria andAccessColorBetween(String value1, String value2) {
            addCriterion("access_color between", value1, value2, "accessColor");
            return (Criteria) this;
        }

        public Criteria andAccessColorNotBetween(String value1, String value2) {
            addCriterion("access_color not between", value1, value2, "accessColor");
            return (Criteria) this;
        }

        public Criteria andAccessBrandIsNull() {
            addCriterion("access_brand is null");
            return (Criteria) this;
        }

        public Criteria andAccessBrandIsNotNull() {
            addCriterion("access_brand is not null");
            return (Criteria) this;
        }

        public Criteria andAccessBrandEqualTo(String value) {
            addCriterion("access_brand =", value, "accessBrand");
            return (Criteria) this;
        }

        public Criteria andAccessBrandNotEqualTo(String value) {
            addCriterion("access_brand <>", value, "accessBrand");
            return (Criteria) this;
        }

        public Criteria andAccessBrandGreaterThan(String value) {
            addCriterion("access_brand >", value, "accessBrand");
            return (Criteria) this;
        }

        public Criteria andAccessBrandGreaterThanOrEqualTo(String value) {
            addCriterion("access_brand >=", value, "accessBrand");
            return (Criteria) this;
        }

        public Criteria andAccessBrandLessThan(String value) {
            addCriterion("access_brand <", value, "accessBrand");
            return (Criteria) this;
        }

        public Criteria andAccessBrandLessThanOrEqualTo(String value) {
            addCriterion("access_brand <=", value, "accessBrand");
            return (Criteria) this;
        }

        public Criteria andAccessBrandLike(String value) {
            addCriterion("access_brand like", value, "accessBrand");
            return (Criteria) this;
        }

        public Criteria andAccessBrandNotLike(String value) {
            addCriterion("access_brand not like", value, "accessBrand");
            return (Criteria) this;
        }

        public Criteria andAccessBrandIn(List<String> values) {
            addCriterion("access_brand in", values, "accessBrand");
            return (Criteria) this;
        }

        public Criteria andAccessBrandNotIn(List<String> values) {
            addCriterion("access_brand not in", values, "accessBrand");
            return (Criteria) this;
        }

        public Criteria andAccessBrandBetween(String value1, String value2) {
            addCriterion("access_brand between", value1, value2, "accessBrand");
            return (Criteria) this;
        }

        public Criteria andAccessBrandNotBetween(String value1, String value2) {
            addCriterion("access_brand not between", value1, value2, "accessBrand");
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

        public Criteria andAccessTimeIsNull() {
            addCriterion("access_time is null");
            return (Criteria) this;
        }

        public Criteria andAccessTimeIsNotNull() {
            addCriterion("access_time is not null");
            return (Criteria) this;
        }

        public Criteria andAccessTimeEqualTo(String value) {
            addCriterion("access_time =", value, "accessTime");
            return (Criteria) this;
        }

        public Criteria andAccessTimeNotEqualTo(String value) {
            addCriterion("access_time <>", value, "accessTime");
            return (Criteria) this;
        }

        public Criteria andAccessTimeGreaterThan(String value) {
            addCriterion("access_time >", value, "accessTime");
            return (Criteria) this;
        }

        public Criteria andAccessTimeGreaterThanOrEqualTo(String value) {
            addCriterion("access_time >=", value, "accessTime");
            return (Criteria) this;
        }

        public Criteria andAccessTimeLessThan(String value) {
            addCriterion("access_time <", value, "accessTime");
            return (Criteria) this;
        }

        public Criteria andAccessTimeLessThanOrEqualTo(String value) {
            addCriterion("access_time <=", value, "accessTime");
            return (Criteria) this;
        }

        public Criteria andAccessTimeLike(String value) {
            addCriterion("access_time like", value, "accessTime");
            return (Criteria) this;
        }

        public Criteria andAccessTimeNotLike(String value) {
            addCriterion("access_time not like", value, "accessTime");
            return (Criteria) this;
        }

        public Criteria andAccessTimeIn(List<String> values) {
            addCriterion("access_time in", values, "accessTime");
            return (Criteria) this;
        }

        public Criteria andAccessTimeNotIn(List<String> values) {
            addCriterion("access_time not in", values, "accessTime");
            return (Criteria) this;
        }

        public Criteria andAccessTimeBetween(String value1, String value2) {
            addCriterion("access_time between", value1, value2, "accessTime");
            return (Criteria) this;
        }

        public Criteria andAccessTimeNotBetween(String value1, String value2) {
            addCriterion("access_time not between", value1, value2, "accessTime");
            return (Criteria) this;
        }

        public Criteria andAccessOuttimeIsNull() {
            addCriterion("access_outtime is null");
            return (Criteria) this;
        }

        public Criteria andAccessOuttimeIsNotNull() {
            addCriterion("access_outtime is not null");
            return (Criteria) this;
        }

        public Criteria andAccessOuttimeEqualTo(String value) {
            addCriterion("access_outtime =", value, "accessOuttime");
            return (Criteria) this;
        }

        public Criteria andAccessOuttimeNotEqualTo(String value) {
            addCriterion("access_outtime <>", value, "accessOuttime");
            return (Criteria) this;
        }

        public Criteria andAccessOuttimeGreaterThan(String value) {
            addCriterion("access_outtime >", value, "accessOuttime");
            return (Criteria) this;
        }

        public Criteria andAccessOuttimeGreaterThanOrEqualTo(String value) {
            addCriterion("access_outtime >=", value, "accessOuttime");
            return (Criteria) this;
        }

        public Criteria andAccessOuttimeLessThan(String value) {
            addCriterion("access_outtime <", value, "accessOuttime");
            return (Criteria) this;
        }

        public Criteria andAccessOuttimeLessThanOrEqualTo(String value) {
            addCriterion("access_outtime <=", value, "accessOuttime");
            return (Criteria) this;
        }

        public Criteria andAccessOuttimeLike(String value) {
            addCriterion("access_outtime like", value, "accessOuttime");
            return (Criteria) this;
        }

        public Criteria andAccessOuttimeNotLike(String value) {
            addCriterion("access_outtime not like", value, "accessOuttime");
            return (Criteria) this;
        }

        public Criteria andAccessOuttimeIn(List<String> values) {
            addCriterion("access_outtime in", values, "accessOuttime");
            return (Criteria) this;
        }

        public Criteria andAccessOuttimeNotIn(List<String> values) {
            addCriterion("access_outtime not in", values, "accessOuttime");
            return (Criteria) this;
        }

        public Criteria andAccessOuttimeBetween(String value1, String value2) {
            addCriterion("access_outtime between", value1, value2, "accessOuttime");
            return (Criteria) this;
        }

        public Criteria andAccessOuttimeNotBetween(String value1, String value2) {
            addCriterion("access_outtime not between", value1, value2, "accessOuttime");
            return (Criteria) this;
        }

        public Criteria andAccessOutdayIsNull() {
            addCriterion("access_outday is null");
            return (Criteria) this;
        }

        public Criteria andAccessOutdayIsNotNull() {
            addCriterion("access_outday is not null");
            return (Criteria) this;
        }

        public Criteria andAccessOutdayEqualTo(String value) {
            addCriterion("access_outday =", value, "accessOutday");
            return (Criteria) this;
        }

        public Criteria andAccessOutdayNotEqualTo(String value) {
            addCriterion("access_outday <>", value, "accessOutday");
            return (Criteria) this;
        }

        public Criteria andAccessOutdayGreaterThan(String value) {
            addCriterion("access_outday >", value, "accessOutday");
            return (Criteria) this;
        }

        public Criteria andAccessOutdayGreaterThanOrEqualTo(String value) {
            addCriterion("access_outday >=", value, "accessOutday");
            return (Criteria) this;
        }

        public Criteria andAccessOutdayLessThan(String value) {
            addCriterion("access_outday <", value, "accessOutday");
            return (Criteria) this;
        }

        public Criteria andAccessOutdayLessThanOrEqualTo(String value) {
            addCriterion("access_outday <=", value, "accessOutday");
            return (Criteria) this;
        }

        public Criteria andAccessOutdayLike(String value) {
            addCriterion("access_outday like", value, "accessOutday");
            return (Criteria) this;
        }

        public Criteria andAccessOutdayNotLike(String value) {
            addCriterion("access_outday not like", value, "accessOutday");
            return (Criteria) this;
        }

        public Criteria andAccessOutdayIn(List<String> values) {
            addCriterion("access_outday in", values, "accessOutday");
            return (Criteria) this;
        }

        public Criteria andAccessOutdayNotIn(List<String> values) {
            addCriterion("access_outday not in", values, "accessOutday");
            return (Criteria) this;
        }

        public Criteria andAccessOutdayBetween(String value1, String value2) {
            addCriterion("access_outday between", value1, value2, "accessOutday");
            return (Criteria) this;
        }

        public Criteria andAccessOutdayNotBetween(String value1, String value2) {
            addCriterion("access_outday not between", value1, value2, "accessOutday");
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