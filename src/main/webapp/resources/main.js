$(document).ready(function () {
  $('#register').validate({
	rules: {
	  firstName: {
		required: true,
		maxlength: 256
	  },
	  lastName: {
		required: true,
		maxlength: 256
	  },
	  username: {
		required: true,
		minlength: 6,
		maxlength: 256
	  },
	  password: {
		required: true
	  },
	  passwordConfirm: {
		required: true,
		equalTo: "#password"
	  },
	  email: {
		required: true,
		email: true
	  },
	  phoneNumber: {
		required: true
	  }

	},
	messages: {
	  firstName: {
		required: "First name is required",
		maxlength: "First name is too long"
	  },
	  lastName: {
		required: "Last name is required",
		maxlength: "Last name is too long"
	  },
	  username: {
		required: "User name is required",
		minlength: "User name is at least 6 characters",
		maxlength: "User name is smaller than 256 characters",
	  },
	  password: {
		required: "Password is required",
	  },
	  passwordConfirm: {
		required: "Password confirm is required",
		equalTo: "Password confirm does not match password"
	  },
	  email: {
		required: "Email is required",
		email: "Email is not right format"
	  },
	  phoneNumber: {
		required: "Phone number is required"
	  }
	}
  });
  $('#login').validate({
	rules: {
	  username: {
		required: true
	  },
	  password: {
		required: true
	  }
	},
	messages: {
	  username: {
		required: "First name is required"
	  },
	  password: {
		required: "Last name is required"
	  }
	}
  });
});
