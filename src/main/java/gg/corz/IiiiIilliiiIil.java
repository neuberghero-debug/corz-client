package gg.corz;

import net.minecraft.class_2338;

record IiiiIilliiiIil(class_2338 pos, int top, boolean existing, boolean raised, boolean armed) {
   private final int iIilIiiIiIlilIiiIi;
   private final boolean llilIiiIiililIiiIi;
   private final boolean iiilIiiIiIIIiIiiIi;
   private final boolean IiilIiiIiliilIiiIi;
   private final class_2338 IIilIiiIilIilIiiIi;

   public boolean iIlIlllllill() {
      return this.llilIiiIiililIiiIi;
   }

   public boolean IilliliilIIi() {
      return this.IiilIiiIiliilIiiIi;
   }

   public class_2338 IliIlllilIi() {
      return this.IIilIiiIilIilIiiIi;
   }

   private IiiiIilliiiIil(class_2338 pos, int top, boolean existing, boolean raised, boolean armed) {
      this.IIilIiiIilIilIiiIi = pos;
      this.iIilIiiIiIlilIiiIi = top;
      this.llilIiiIiililIiiIi = existing;
      this.IiilIiiIiliilIiiIi = raised;
      this.iiilIiiIiIIIiIiiIi = armed;
   }

   public int liiiIIllIl() {
      return this.iIilIiiIiIlilIiiIi;
   }

   public boolean lIiiIiIlilli() {
      return this.iiilIiiIiIIIiIiiIi;
   }
}
