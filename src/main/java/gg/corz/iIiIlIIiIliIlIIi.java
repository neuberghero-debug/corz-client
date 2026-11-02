package gg.corz;

import java.util.function.BooleanSupplier;

final class iIiIlIIiIliIlIIi {
   private int iIiIilliil = (-2089297735 ^ 45 ^ -97) + -41 ^ -58186014;
   private boolean IliIilliil;
   private int lIiIilliil;

   void liiiIIllIl() {
      this.IliIilliil = false;
   }

   boolean iIlIlllllill() {
      return this.IliIilliil;
   }

   void lIiiIiIlilli() {
      this.lIiIilliil = 0;
      this.iIiIilliil = -(-377517747 - 69) ^ -1769965832;
      this.IliIilliil = false;
   }

   int IilliliilIIi() {
      return this.lIiIilliil;
   }

   boolean IliIlllilIi(int target, boolean allowed, BooleanSupplier roll) {
      if (this.lIiIilliil > 0) {
         this.lIiIilliil--;
      }

      if (target != Integer.MIN_VALUE && (this.iIiIilliil == Integer.MIN_VALUE || target == this.iIiIilliil)) {
         this.iIiIilliil = target;
         if (allowed && this.lIiIilliil <= 0) {
            this.IliIilliil = roll.getAsBoolean();
            this.lIiIilliil = 10;
            return this.IliIilliil;
         } else {
            return false;
         }
      } else {
         this.iIiIilliil = Integer.MIN_VALUE;
         return false;
      }
   }
}
