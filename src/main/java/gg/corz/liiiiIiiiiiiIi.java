package gg.corz;

import net.minecraft.class_2338;

public interface liiiiIiiiiiiIi {
   int IliIlliiilliIlliii = 0;
   int iliIlliiiIiiIlliii = 1;
   int liiIlliiiiiiIlliii = 2;

   float IilliliilIIi(class_2338 var1);

   default boolean IIlllIlliIll(class_2338 feet) {
      return feet != null
         && this.IlIlllIlilIl(feet.method_10074())
         && this.IliIlllilIi(feet)
         && this.IliIlllilIi(feet.method_10084())
         && !this.liiiIIllIl(feet)
         && !this.liiiIIllIl(feet.method_10084());
   }

   boolean liiiIIllIl(class_2338 var1);

   boolean IliIlllilIi(class_2338 var1);

   float iIlIlllllill(class_2338 var1);

   boolean lIiiIiIlilli(class_2338 var1);

   int iliIiiliiiii(class_2338 var1);

   boolean IiIlliIliiIl(class_2338 var1);

   boolean IIIllIIliIIl(class_2338 var1);

   boolean IlIlllIlilIl(class_2338 var1);

   default boolean Illlllllilll(class_2338 p) {
      return this.IliIlllilIi(p) && this.IiIlliIliiIl(p) && !this.liiiIIllIl(p);
   }

   default boolean Iilllilliill(class_2338 p) {
      return !this.IliIlllilIi(p) && this.IlIlllIlilIl(p);
   }
}
