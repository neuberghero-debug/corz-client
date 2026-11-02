package gg.corz;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_742;
import net.minecraft.class_12079.class_12081;

public class iIllIIlIlllIIl extends ilIllIiIll implements IiIiilliIiil {
   private static final String IIlllliIllIlllliIl = "corzclient";
   private final lliliIIiililiIIi lIIllliIliIIllliIl = new lliliIIiililiIIi(
      IliIlllilIi<"IliIlllilIi","txARV/GVSqooPm3w0lfnQnsmHWKXOcl8RlZax7A95wHBaiWrAzyKD78=">(),
      IliIlllilIi<"IliIlllilIi","n5FzYJxfMzgB61ZqX4VDpg1fn/xZVazrh6PtOAWS5LEGz+3PQLrkPW05bbv7WF/VNmccK750LTcCr3moh+Hq/U+NGw==">(),
      IliIlllilIi<"IliIlllilIi","/csAgIWNpimqjifjBM/3uEQf/C2OPfQDuHyr9aC+h8M=">(),
      IIllllIlll()
   );
   private static final Map<class_2960, IiilllIiliilllIi> liIllliIliiIllliIl = new HashMap<>();
   public static class_2960 IilllliIllilllliIl = null;
   public final IiIllIliliIllIli iilllliIlIIillliIl;
   private static iIllIIlIlllIIl lllllliIlillllliIl;
   private final iiIiiilIIliiil IlIllliIlllIllliIl = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","HHPpBROYfJ3gtI9OR9VUunnZzlhnQHi7M8Qc05zxSHYuRtEUSokA8g==">(),
      IliIlllilIi<"IliIlllilIi","zWiI/BWDtX+1DahOQq99LsCkO9xCXN03LU6YMcjXypGVBbpda/0pruJzOCrRSYvyCMOztWkjCCEqAm9WYh4=">(),
      true
   );
   private static final String iIlllliIlIllllliIl = "textures/capes/";
   public static final String IiiIlliIlliiIlliIl = "None";
   private static final Map<String, class_2960> iiiIlliIlIIIllliIl = new LinkedHashMap<>();
   private final iiIiiilIIliiil ilIllliIlIiIllliIl = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","lmeQJ8d7KFFMPRagkAhdzOFJ1ijMoWeD9V8uipI7HJ33aio=">(),
      IliIlllilIi<"IliIlllilIi","HAZMhj9xLc+c90ST7HPPAHGw5FllqIDs1a0LRzwGHByyl1u2ulw22y8NmTdeBK2W32VwvRqi/PYUx+Un9j13raBsq3mh9SGMr/m7vWTX407Vt8FCXeSZhp+oKJ/+tRnL+w==">(),
      true
   );

   public iIllIIlIlllIIl() {
      super(IliIlllilIi<"IliIlllilIi","gp+R8T791ANEMygXA5ZTS8lvaT2TlBgSt8Aw4p1mVC8lLY5SnZTAwP8=">(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.iilllliIlIIillliIl = new IiIllIliliIllIli();
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.lIIllliIliIIllliIl, this.IlIllliIlllIllliIl, this.ilIllliIlIiIllliIl});
      lllllliIlillllliIl = this;
   }

   public static class_12081 Ilillllill(class_2960 tex) {
      return liIllliIliiIllliIl.computeIfAbsent(tex, IiilllIiliilllIi::new);
   }

   public class_2960 Iillllilll() {
      String var1 = this.lIIllliIliIIllliIl.Iilllilliill();
      return IliIlllilIi<"IliIlllilIi","/csAgIWNpimqjifjBM/3uEQf/C2OPfQDuHyr9aC+h8M=">().equals(var1) ? null : iiiIlliIlIIIllliIl.get(var1);
   }

   public static boolean iIlllIllll() {
      iIllIIlIlllIIl var0 = lllllliIlillllliIl;
      return var0 == null || var0.ilIllliIlIiIllliIl.Iilllilliill();
   }

   @Override
   public void IlIllllIll(double mx, double my) {
      this.iilllliIlIIillliIl.iIlIlllllill(mx, my);
   }

   @Override
   public void ilIllIiIll() {
      this.iilllliIlIIillliIl.IilliliilIIi();
   }

   public static class_2960 iilllIIill(class_742 player) {
      if (class_310.method_1551().field_1724 != player) {
         return null;
      } else if (IilllliIllilllliIl != null) {
         return IilllliIllilllliIl;
      } else {
         if (!(llilIllililIll.iliIiiliiiii(iIllIIlIlllIIl.class) instanceof iIllIIlIlllIIl var2) || !var2.IliIlllilIi()) {
            return null;
         }

         return !var2.IlIllliIlllIllliIl.Iilllilliill() ? null : var2.Iillllilll();
      }
   }

   public class_2960 lIilliIill() {
      return this.Iillllilll();
   }

   private static class_2960 liIlliiIll(String name) {
      return class_2960.method_60655(
         IliIlllilIi<"IliIlllilIi","xyZt5/dRlqaRPJlDdRbalTWeKho/TLqEaUnZzbguq3nlDz9nAyM=">(),
         IliIlllilIi<"IliIlllilIi","0czd+Ah+S466m/11Z/T9NJcaRUSkPJsuPGU4EE4rpnimug9JKgEOhX8qEw==">()
            + name
            + IliIlllilIi<"IliIlllilIi","I0tetU8JmshA6LJZ4E4t+T2DZfDKcHgrzDSw+ltywus=">()
      );
   }

   static {
      iiiIlliIlIIIllliIl.put(
         IliIlllilIi<"IliIlllilIi","R/91wzzAqmzfaDkN2PsSuEfJ5l7DaXPgsHYrH3fy5Uk75Vfs">(),
         liIlliiIll(IliIlllilIi<"IliIlllilIi","NjUDE/xuocC/w9dEacnMgEF9M+npc30ua70dNjy/2XsyYQc4BZ1S83qSYg==">())
      );
      iiiIlliIlIIIllliIl.put(
         IliIlllilIi<"IliIlllilIi","C835y6OUQ/Ai2bncFnRf7gj0D057wT95SRIjVWRq2HkAKk4=">(),
         liIlliiIll(IliIlllilIi<"IliIlllilIi","VfFqeUpsBnhYHrmJmnyk7ExSERRIcb+QB4dKz+ZUTCz7DnCUb2Ow">())
      );
      iiiIlliIlIIIllliIl.put(
         IliIlllilIi<"IliIlllilIi","c3eLUZvYMGyvv9BKk0z+cLr2LTe+/obN65QmXcLEvdZq9A/7UZImImDjFg==">(),
         liIlliiIll(IliIlllilIi<"IliIlllilIi","mCxNGUi3IjTSX1KgRKRLfi8Nyd6PnSpQUqpeYVDoDv1O8kScD7xrvj7umw==">())
      );
      iiiIlliIlIIIllliIl.put(
         IliIlllilIi<"IliIlllilIi","Ls0cuprwrd+OFQy2ED6ZSBaa4+IEqLmb2yqhQ58dKPs/RI8=">(),
         liIlliiIll(IliIlllilIi<"IliIlllilIi","l4WoqeQ3aU6xopYBeVATCybdjKDn2sX4mPbh/lp83xCrD7d331w8dQ==">())
      );
      iiiIlliIlIIIllliIl.put(
         IliIlllilIi<"IliIlllilIi","bY0z7DWJubjK0mzfBKFhKBQQUNvGc7S8zavXMFD6sNkat30=">(),
         liIlliiIll(IliIlllilIi<"IliIlllilIi","3gOdU4C+IOzoI4F8O49aC/hxSE94yrigzbKHX1S70RBlNdZKc25PB3E=">())
      );
      iiiIlliIlIIIllliIl.put(
         IliIlllilIi<"IliIlllilIi","QVY2u3Usts8C5dgW2LaVhxmI0uY7Ri31iCNi7izNDlCiU1mLDQ==">(),
         liIlliiIll(IliIlllilIi<"IliIlllilIi","HVIymCVBRiLML1iPDPIQ31nSTVRP2DXlJmro2i3VX5zw+4rRVto=">())
      );
      iiiIlliIlIIIllliIl.put(
         IliIlllilIi<"IliIlllilIi","lMB+C1GwXAw7Yp2g4I5YPsgVz/dz8v5dsqbMM0Z02y5gOayp2S+sVQ==">(),
         liIlliiIll(IliIlllilIi<"IliIlllilIi","uUtoJec5K91HZ3qY0iFwEKG8D2YKuJuo7G0a4An+Qdd2O4GeLE6axw==">())
      );
      iiiIlliIlIIIllliIl.put(
         IliIlllilIi<"IliIlllilIi","IWxW/Kb0Fze4SfsgjzVsH7wfd+fW2SD1k5nQy7pYDqyhukCekw==">(),
         liIlliiIll(IliIlllilIi<"IliIlllilIi","w5FnJHWPyq/4ULjubp865r3OPTS0LHayB4VVUra2jfBRpneeueE=">())
      );
      iiiIlliIlIIIllliIl.put(
         IliIlllilIi<"IliIlllilIi","73MMStCU481lkKwCsoGeUY1QYAzvqM7SzKLtKrJeEbV84Rvv3CeS/usZ">(),
         liIlliiIll(IliIlllilIi<"IliIlllilIi","frTWMIcSVHIO+9VZm4QUsPaPZdkIyrwzjoFRnmNBI1RBm4TgW/VDCUXW">())
      );
      iiiIlliIlIIIllliIl.put(
         IliIlllilIi<"IliIlllilIi","j3bSv84kKqgV32QNZUB36bEvpMrYiuHk1hAbnyUgwP8=">(),
         liIlliiIll(IliIlllilIi<"IliIlllilIi","koZaYmiuvy4EZhDD0dmIPkzGDaHZyuuMMyrI5royc3dqeD12ddACLjY=">())
      );
   }

   public static boolean lllllillll(class_2960 texture) {
      return texture != null
         && IliIlllilIi<"IliIlllilIi","xyZt5/dRlqaRPJlDdRbalTWeKho/TLqEaUnZzbguq3nlDz9nAyM=">().equals(texture.method_12836())
         && texture.method_12832().startsWith(IliIlllilIi<"IliIlllilIi","0czd+Ah+S466m/11Z/T9NJcaRUSkPJsuPGU4EE4rpnimug9JKgEOhX8qEw==">());
   }

   @Override
   public void iiiIlIIIll(class_332 w, int x, int h, int ctx, int y) {
      this.iilllliIlIIillliIl.IliIlllilIi(w, x, h, ctx, y, this.lIilliIill());
   }

   @Override
   public boolean lIIlliIIll(double mx, double my, int y, int button, int w, int h, int x) {
      return this.iilllliIlIIillliIl.liiiIIllIl(mx, my, y, button, w, h, x);
   }

   private static String[] IIllllIlll() {
      String[] var0 = new String[iiiIlliIlIIIllliIl.size() + 1];
      var0[0] = IliIlllilIi<"IliIlllilIi","/csAgIWNpimqjifjBM/3uEQf/C2OPfQDuHyr9aC+h8M=">();
      int var1 = 1;

      for (String var3 : iiiIlliIlIIIllliIl.keySet()) {
         var0[var1++] = var3;
      }

      return var0;
   }
}
