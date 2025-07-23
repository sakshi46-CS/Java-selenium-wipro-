package Day3;

	class individualkyc implements KYCverification {

		@Override
		public void collectDocument() {
			 System.out.println("Collecting Aadhaar and PAN for Individual...");
			
		}

		@Override
		public void validatepan() {
		System.out.println("Validating Individual PAN...");
			
		}

		@Override
		public void verifyAddress() {
			 System.out.println("Verifying address via Aadhaar...");
		}

}
