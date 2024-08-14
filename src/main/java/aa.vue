
<template>
    <el-row>
        <el-col :span="12">
            <el-form-item label="实收资本（人民币万元）" prop="paidUpCap">
                <el-input v-model="displayPaidUpCap" autocomplete="off" name="paidUpCap" type="number"
                          @focus="onFocus('paidUpCap')" @blur="onBlur('paidUpCap')" @keydown.native="clearInput"
                          clearable class="input-control"></el-input>
            </el-form-item>
        </el-col>
    </el-row>
    <el-row>
        <el-col :span="12">
            <el-form-item label="长期次级债务数据（人民币万元）" prop="subdDebt">
                <el-input v-model="displaySubdDebt" name="subdDebt" autocomplete="off" type="number"
                          @focus="onFocus('subdDebt')" @blur="onBlur('subdDebt')" @keydown.native="clearInput" clearable
                          class="input-control" maxlength="200"></el-input>
            </el-form-item>
        </el-col>
    </el-row>
</template>
<script> export default {
    data() {
        return {
            info: {
            paidUpCap: 0, subdDebt: 0},
            formattedValues: {paidUpCap: "0.00", subdDebt: "0.00"}};
    },
    computed: {
        displayPaidUpCap: {
            get() {
                return this.formattedValues.paidUpCap;
            }, set(value) {
                const parsedValue = parseFloat(value.replace(/,/g, ""));
                if (!isNaN(parsedValue)) {
                    this.$set(this.info, "paidUpCap", parsedValue);
                } else {
                    this.$set(this.info, "paidUpCap", 0);
                }
            }
        },
        displaySubdDebt: {
            get() {
                return this.formattedValues.subdDebt;
            }, set(value) {
                const parsedValue = parseFloat(value.replace(/,/g, ""));
                if (!isNaN(parsedValue)) {
                    this.$set(this.info, "subdDebt", parsedValue);
                } else {
                    this.$set(this.info, "subdDebt", 0);
                }
            }
        }
    },
    methods: {
        onFocus(fieldName) {
            this.formattedValues[fieldName] = this.info[fieldName].toString();
        }, onBlur(fieldName) {
            this.formattedValues[fieldName] = this.info[fieldName].toLocaleString(undefined, {
                minimumFractionDigits: 2,
                maximumFractionDigits: 2
            });
        }, clearInput() {
            event.currentTarget.value = "";
        }
    }
}; </script>