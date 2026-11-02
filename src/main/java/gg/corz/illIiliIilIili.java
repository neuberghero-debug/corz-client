package gg.corz;

import net.minecraft.class_1922;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_3726;

public interface illIiliIilIili {
   default class_3726 Iilllilliill() {
      return class_3726.method_16194();
   }

   default liIliliiiIlili IiIlliIliiIl() {
      return liIliliiiIlili.IllIIIlIIl;
   }

   default liIIilliiIIill IIillIiliIil(class_1922 want, long cell, class_2680 w) {
      return lIiIliIliIiIliIl.IiiIlliiIl(want, class_2338.method_10092(cell), w);
   }

   boolean IilliliilIIi(long var1);

   default Iterable<Long> liiiIIllIl(long maxDistanceSquared, double stand) {
      return this.IliIlllilIi();
   }

   long IIIllIIliIIl();

   default boolean Illlllllilll(class_2680 want) {
      return lIiIliIliIiIliIl.iiiIlIIIll(want);
   }

   default boolean IIlllIlliIll(class_2680 want) {
      return true;
   }

   class_2680 iIlIlllllill(long var1);

   default int IlIlllIlilIl(long stand) {
      return Math.abs(liIiIiIiiiIiIiIi.lilIliilIl(stand) - liIiIiIiiiIiIiIi.lilIliilIl(this.IIIllIIliIIl()))
         + Math.abs(liIiIiIiiiIiIiIi.IIiIllIiIl(stand) - liIiIiIiiiIiIiIi.IIiIllIiIl(this.IIIllIIliIIl()))
         + Math.abs(liIiIiIiiiIiIiIi.iIiIlIliIl(stand) - liIiIiIiiiIiIiIi.iIiIlIliIl(this.IIIllIIliIIl()));
   }

   Iterable<Long> IliIlllilIi();

   double iliIiiliiiii();

   Iterable<Long> lIiiIiIlilli();
}
