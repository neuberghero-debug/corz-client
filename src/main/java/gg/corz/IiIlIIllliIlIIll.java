package gg.corz;

public record IiIlIIllliIlIIll(int requiredStorageSlots, int availableStorageSlots, int missingStorageSlots, int usableContainers, int inaccessibleContainers) {
   private final int ilIIIIllll;
   private final int llIIIIllll;
   private final int IlIIIIllll;
   private final int iIIIIIllll;
   private final int IiIIIIllll;

   public String liiiIIllIl() {
      return IlIlllIlilIl<"IlIlllIlilIl","wnjn7b1eJvcDiCk5MY18xQ/HBcKQwHANEiIE/nBOELGipACpfihcFAUgnof5Ezt4Xz9W73GY08kVR5QwSP+oDaPo270yadWO1upUw8KZVPHWLKPiAVQID1iZxKSyspL++C7Idvc=">()
         + this.iIIIIIllll
         + IlIlllIlilIl<"IlIlllIlilIl","z6BoL1tvHi4V9S2MJCfSwwC1B+BLsy7nSf5LWNqANm1pY+x5+3pJfI4XX3dKJ1B7fE3X">()
         + this.IlIIIIllll
         + IlIlllIlilIl<"IlIlllIlilIl","UP78cjUcACFjlxHl2ywlXtjzwROSJTR61qNxQt3xzDQ/BOcjJ1/F2+bNI1HXERytGw==">()
         + this.llIIIIllll
         + IlIlllIlilIl<"IlIlllIlilIl","dl/r2MaPcM11WqRZQK3r/hznr5xYF54kefRp2St3jdq8CevQaUepqrjBkIdpOA==">()
         + this.ilIIIIllll
         + IlIlllIlilIl<"IlIlllIlilIl","FXByLAFC1LlWTY2vCtXdDfqtAi6FuOJCgm4OsrHSZV+6KhBah0SBleBKyfo4FuxNczZjCA==">()
         + this.IiIIIIllll;
   }

   public IiIlIIllliIlIIll(int requiredStorageSlots, int availableStorageSlots, int missingStorageSlots, int usableContainers, int inaccessibleContainers) {
      this.iIIIIIllll = requiredStorageSlots;
      this.IlIIIIllll = availableStorageSlots;
      this.llIIIIllll = missingStorageSlots;
      this.ilIIIIllll = usableContainers;
      this.IiIIIIllll = inaccessibleContainers;
   }

   public int iliIiiliiiii() {
      return this.ilIIIIllll;
   }

   public int IIIllIIliIIl() {
      return this.IiIIIIllll;
   }

   public boolean IliIlllilIi() {
      return this.llIIIIllll <= 0;
   }

   public int IilliliilIIi() {
      return this.IlIIIIllll;
   }

   public int lIiiIiIlilli() {
      return this.llIIIIllll;
   }

   public int iIlIlllllill() {
      return this.iIIIIIllll;
   }
}
