package gg.corz;

import java.util.function.Supplier;

public class ililliIiIiilliIi extends IilliIllilliIl {
   private Supplier<Integer> IlIiiliIIi;
   private final Runnable IIIiiliIIi;
   private final String lIIiiliIIi;
   private boolean llIiiliIIi;
   private Supplier<String> iIIiiliIIi = null;

   public ililliIiIiilliIi IIillIiliIil(Supplier<String> supplier) {
      this.iIIiiliIIi = supplier;
      return this;
   }

   public int IiIiliIiiiIi() {
      if (this.IlIiiliIIi != null) {
         try {
            Integer var1 = this.IlIiiliIIi.get();
            if (var1 != null) {
               return var1;
            }
         } catch (Exception var2) {
         }
      }

      return 0;
   }

   public void IIlilIliiIli() {
      if (this.IIIiiliIIi != null) {
         try {
            this.IIIiiliIIi.run();
         } catch (Exception var2) {
         }
      }
   }

   public ililliIiIiilliIi(String name, String description, Runnable action) {
      this(name, description, name, action);
   }

   public ililliIiIiilliIi(String description, String label, String action, Runnable name) {
      super(description, label);
      this.IlIiiliIIi = null;
      this.llIiiliIIi = false;
      this.lIIiiliIIi = action;
      this.IIIiiliIIi = name;
   }

   public String IlIillIiilIi() {
      if (this.iIIiiliIIi != null) {
         try {
            String var1 = this.iIIiiliIIi.get();
            if (var1 != null) {
               return var1;
            }
         } catch (Exception var2) {
         }
      }

      return this.IliIlllilIi();
   }

   public String Iilllilliill() {
      return this.lIIiiliIIi;
   }

   public ililliIiIiilliIi Ililllililil() {
      this.llIiiliIIi = true;
      return this;
   }

   public ililliIiIiilliIi IIIilIIiiIIi(Supplier<Integer> supplier) {
      this.IlIiiliIIi = supplier;
      return this;
   }

   public boolean Iiilliiliiil() {
      return this.llIiiliIIi;
   }

   @Override
   public iIiIiIIlIliIiIIl IiIlliIliiIl() {
      return iIiIiIIlIliIiIIl.iliIlIilIl;
   }
}
