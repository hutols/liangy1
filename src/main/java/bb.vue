<template>
    <el-form-item label="资本净额" prop="capNetamt">
        <el-input
                v-model="formattedCapNetamt"
                @focus="onFocus"
                @blur="onBlur"
                type="text"
                clearable
                class="input-control"
        />
    </el-form-item>
</template>

<script>
export default {
    data() {
        return {
            info: {
                capNetamt: 0, // 初始化资本净额
            },
            rawCapNetamt: '', // 记录输入的原始值
            isFocus: false, // 记录是否聚焦
        };
    },
    computed: {
        formattedCapNetamt() {
            if (this.isFocus) {
                return this.rawCapNetamt; // 聚焦时展示原始值
            } else {
                return this.info.capNetamt.toLocaleString(); // 失焦时展示千分位
            }
        },
    },
    methods: {
        onFocus() {
            this.isFocus = true;
            this.rawCapNetamt = this.info.capNetamt; // 记录输入的原始值
        },
        onBlur() {
            this.isFocus = false;
        },
    },
};
</script>