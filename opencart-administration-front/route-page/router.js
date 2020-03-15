const routes = [
    { path: '/product/search', component: ProductSearchRoutePage },
    { path: '/product/create', component: ProductCreateRoutePage },

    { path: '/customer/search', component: CustomerSearchRoutePage },
    { path: '/customer/show/:customerId', component: CustomerShowRoutePage },

    { path: '/address/index/:customerId', component: AddressIndexRoutePage },
    { path: '/address/show/:addressId', component: AddressShowRoutePage },

    { path: '/order/search', component: OrderSearchRoutePage },
    { path: '/return/search', component: ReturnSearchRoutePage },
    { path: '/administrator/index', component: AdministratorIndexRoutePage }
];

const router = new VueRouter({
    routes: routes
});