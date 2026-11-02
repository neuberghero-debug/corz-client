package gg.corz;

import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2350.class_2351;

public final class IiIIiiIlliIIiiIl {
   public final class_2338[] iiillIIlll;
   public final int iIIilIIlll;
   public final int lIIilIIlll;
   public final int IlIilIIlll;
   public final int IIIilIIlll;
   public final class_2350 liillIIlll;
   public final class_2338 IiillIIlll;

   private IiIIiiIlliIIiiIl(class_2338 outsideArea, class_2350 cells, class_2338[] center, int insideArea, int outsideSolid, int face, int usefulCells) {
      this.IiillIIlll = outsideArea;
      this.liillIIlll = cells;
      this.iiillIIlll = center;
      this.IIIilIIlll = insideArea;
      this.lIIilIIlll = outsideSolid;
      this.iIIilIIlll = face;
      this.IlIilIIlll = usefulCells;
   }

   @Override
   public String toString() {
      return lIiiIiIlilli<"lIiiIiIlilli","AbyuGLXCjA5bJkg9c4glgDmFLgB4SFfQVqloR58GCuvfpYk=">()
         + this.IiillIIlll.method_10263()
         + lIiiIiIlilli<"lIiiIiIlilli","hvYkWQqrrNMwQ+BT4kdgOzwvBK8O8IRFjH3iRfU=">()
         + this.IiillIIlll.method_10264()
         + lIiiIiIlilli<"lIiiIiIlilli","hvYkWQqrrNMwQ+BT4kdgOzwvBK8O8IRFjH3iRfU=">()
         + this.IiillIIlll.method_10260()
         + lIiiIiIlilli<"lIiiIiIlilli","FDiRhA88FXNpSh3TLpiRkngKy8N1FPbxgKMezu6P7fAV0Q==">()
         + this.liillIIlll
         + lIiiIiIlilli<"lIiiIiIlilli","a1DKhC1AfheSeUBrFRIBBE9UqOvzHI0qNv/rOAR2OvR8TKQAsWXK">()
         + 9
         + lIiiIiIlilli<"lIiiIiIlilli","IlUvx06pVxiq/pSQYabnlZmqwshMVLa2gDfMcfq/uFnlZxGc">()
         + this.IIIilIIlll
         + lIiiIiIlilli<"lIiiIiIlilli","TaWXbrcNaplh0kwAqrJSRiDdWyMVwetrfzlQwrl4OU0sg7AmeRN6qqQ=">()
         + this.lIIilIIlll
         + lIiiIiIlilli<"lIiiIiIlilli","asASPjttAr0jvg5hZMy4pVSxN7a8oSe9dYGn25Vcgd+7sU46FeR7+9q4">()
         + this.iIIilIIlll
         + lIiiIiIlilli<"lIiiIiIlilli","/Vcu3+GW8O4ItI+Lih4PJqflcK/c+ymESt5ds81sFKI4M1FN">()
         + this.IlIilIIlll
         + lIiiIiIlilli<"lIiiIiIlilli","h0+Vlw7mf6RvH8VoQbAhA3UyjTbowPOjy6nazvGaD9OETA==">()
         + this.liiiIIllIl();
   }

   public boolean iIlIlllllill(class_2351 normal) {
      return this.liillIIlll.method_10166() == normal;
   }

   public boolean liiiIIllIl() {
      return this.iIIilIIlll == 0 && this.IlIilIIlll >= 1;
   }

   public static IiIIiiIlliIIiiIl IliIlllilIi(lilIIliilIIl w, class_2338 face, class_2350 center) {
      class_2338[] var3 = new class_2338[9];
      int[] var4 = new int[4];
      int[] var5 = new int[]{0};
      IiIIIlIiliIIIlIi.liiiIIllIl(face, center, (cells, x, y) -> {
         var3[var5[0]++] = new class_2338(cells, x, y);
         if (w.IliIlllilIi(cells, x, y)) {
            var4[0]++;
            if (w.liiiIIllIl(cells, x, y)) {
               var4[3]++;
            }
         } else {
            var4[1]++;
            if (w.iIlIlllllill(cells, x, y)) {
               var4[2]++;
            }
         }
      });
      return new IiIIiiIlliIIiiIl(face, center, var3, var4[0], var4[1], var4[2], var4[3]);
   }
}
