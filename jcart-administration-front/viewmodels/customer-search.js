var app = new Vue({
    el: '#app',
    data: {
        pageInfo: '',
        pageNum: 1,
        
    },
    mounted() {
        console.log('view mounted');
        this.searchCustomer();
    },
    methods: {
        handlePageChange(val) {
            console.log('page changed');
            this.pageNum = val;
            this.searchCustomer();
        },
        handleUpdateStatus(index, row) {
            console.log('update status click');
            this.updateCustomerStatus(row.customerId, row.status);
        },
        searchCustomer() {
            axios.get('/customer/search', {
                params: {
                    pageNum: this.pageNum
                }
            })
                .then(function (response) {
                    console.log(response);
                    app.pageInfo = response.data;
                })
                .catch(function (error) {
                    console.log(error);
                });
        },
       
    }
})