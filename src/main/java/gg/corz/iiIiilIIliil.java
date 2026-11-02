package gg.corz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_742;
import net.minecraft.class_7920;
import net.minecraft.class_8685;

public class iiIiilIIliil extends ilIllIiIll implements IiIiilliIiil {
   private static final Map<class_2960, class_8685> liIllIiiiiIllIii;
   private final ililliIiIiilliIi lllllIiiillllIii;
   public static int IIlllIiilIlllIii;
   private static final List<class_2960> ilIllIiiIiIllIii = new ArrayList<>();
   public final iIllIIilIlllIIil IilllIiililllIii;
   private int iIlllIiiIllllIii = IIllllIlll();

   private void liIlliiIll() {
      if (ilIllIiiIiIllIii.size() > 1) {
         int var1 = this.iIlllIiiIllllIii;

         while (this.iIlllIiiIllllIii == var1) {
            this.iIlllIiiIllllIii = IIllllIlll();
         }
      }
   }

   private class_8685 iIlllIllll(int i) {
      class_2960 var2 = ilIllIiiIiIllIii.get(Math.floorMod(i, ilIllIiiIiIllIii.size()));
      return liIllIiiiiIllIii.computeIfAbsent(var2, t -> class_8685.method_74884(new liilIiIliiilIiIl(t), null, null, class_7920.field_41123));
   }

   static {
      for (String var3 : new String[]{
         IliIlllilIi<"IliIlllilIi","2TeRCJVrQoIoKx08ZXHIcFVVBaRBQK6UAULp2nTqTllOEA08IilI">(),
         IliIlllilIi<"IliIlllilIi","uYA/4fYjHaucJFEkF00vGc+Q0FKuPVj5Is1uHzYEp1hm">(),
         IliIlllilIi<"IliIlllilIi","TEnFxZ2qQ7UQ49RG93tYLwmHY94dgMHNImhWuX4vbGDxzW1+YOobHWWd">(),
         IliIlllilIi<"IliIlllilIi","57bnnvIf+ypK0ue6ZrWLVUZfGhHEx7jdRJzWZEmy/+Zq0A==">(),
         IliIlllilIi<"IliIlllilIi","gXERDCy3Ie7l3OgaVX4L2Z5MU5QKjxfqeRrzw8phuJJX2g==">(),
         IliIlllilIi<"IliIlllilIi","ZVs3gdf5OQBGsLJU48cn1Y4m6S+rhmWTdRtbl6S56IMP">(),
         IliIlllilIi<"IliIlllilIi","c5wIezHdFBQbkiBm5azFMoTG6NQLfU04DwNb0CrXbKeTaj8=">(),
         IliIlllilIi<"IliIlllilIi","qUCoCJFvbobxVNE0svzYfmNMPQXSSYy1WRjHq0tqlXICbQ==">(),
         IliIlllilIi<"IliIlllilIi","ByAiHv220SO68LBYZdD0XIvQs4pd3lz7uMmwgt32v5numbx+NZg=">(),
         IliIlllilIi<"IliIlllilIi","q2o/YN3rjpUCHD9igPHeGdHcULLi3+9kUaQcBGkwoi70Wk9H1Qk=">(),
         IliIlllilIi<"IliIlllilIi","ct1eV2/jo5AJDDELpfTDXRX+ocKVQEeUdfrx2D6InbdDklOxotgrIRdQ">(),
         IliIlllilIi<"IliIlllilIi","cVQw2ynwGSBRhiD9s4CVf0tEA0i3FMep5fD93paoVL59">(),
         IliIlllilIi<"IliIlllilIi","aIWC4B3MiGMwc1IUUc+5b8pdiAjUoXpSTmcADfbSY2V/fpeom24=">(),
         IliIlllilIi<"IliIlllilIi","fv3AyevOFyxREHgI1rMkT2OjAhUGA+Dkkgf8N09J/lPXzvei">(),
         IliIlllilIi<"IliIlllilIi","/8v4vsfMOtsxXzjMb9ps1Es8OE1PP4FjHFVZmBWkpYhxoL3FPkY=">(),
         IliIlllilIi<"IliIlllilIi","fb+NhPGuqoJLITqZF34C+8aBzvnM7SnxdRCCnLB5IZTwK/81cYQ=">(),
         IliIlllilIi<"IliIlllilIi","3hS/M2pTkhurVmNxA/uQurvNLv9aWRaorvqKdf0yY3poBQ==">(),
         IliIlllilIi<"IliIlllilIi","vPz2gTf/oXK9ssshRtbUh9tfCW5oHSiaov2663YrarXEMeGGPg==">(),
         IliIlllilIi<"IliIlllilIi","qcvYl3ysVkkCqLF5hqqo6zwpEoGRs0mUJh7HMdGEFDiJYx7MDqsF">(),
         IliIlllilIi<"IliIlllilIi","a0TcSOSe1xYCJoi+7tbC7s98kRqMOhN7wfVp0qugiFzPpGJokZwOADw=">(),
         IliIlllilIi<"IliIlllilIi","Wa7g3vnT5tPWiT4Y+hf4AcqjOGjTYE/Bw/mdUjk4m6aRfbQo3w==">(),
         IliIlllilIi<"IliIlllilIi","YRMUnVu8HDUNsbt/TsOqXojLSDqMEG3uT5VDwOxMKfUF8xJO3g==">(),
         IliIlllilIi<"IliIlllilIi","AfK7Z8oKe0FcA2hlkfwFl0fhBxP4eomMdNlTvTKGKS9IvzV5Ih8=">(),
         IliIlllilIi<"IliIlllilIi","2laWHtwjqr+j1JTfIH/Q7tYphSlFxJZFM3oHKnjCnoA=">(),
         IliIlllilIi<"IliIlllilIi","qjARHYnEt0wZ9TsHGSz32hx5WB3gEwKR11FqUoypmDdV">(),
         IliIlllilIi<"IliIlllilIi","TSnXdOwY1CgmGbOUd/7sv+ZV8rIszCvph1RK2Q69HbtlzRT8">(),
         IliIlllilIi<"IliIlllilIi","7b7cW4FY9GT3XxLHOVNUa2F7Pde6oOOdBaqC3HoUVSH8aRLazUJCng==">(),
         IliIlllilIi<"IliIlllilIi","QzeTMoueR2a9TPllZaYWddMIpG7UauofYTvkY8md3bqUMvQ=">(),
         IliIlllilIi<"IliIlllilIi","9njLvJlZD48eeek1oT1u1Fb+7IrQTDHaRpTpRzZJAtI=">(),
         IliIlllilIi<"IliIlllilIi","2WoikNSrzVs42NiiwYz/Y2/e/LsdvlNmOKTFw69quxwdeRc=">(),
         IliIlllilIi<"IliIlllilIi","hM4c0LWxzrpZNVt2Sraif/bli4bQ4dmD3NMj/89r8HU=">(),
         IliIlllilIi<"IliIlllilIi","Q9T18b4itbtgpoJrcX5vbvPAeohR5cbagEUqjRHFf5ivIH+P5iY=">(),
         IliIlllilIi<"IliIlllilIi","/DDqBnmV2xDTvRll9zQbBzhWZRnw+7Twd8VPNq3nBgc=">()
      }) {
         ilIllIiiIiIllIii.add(
            class_2960.method_60655(
               IliIlllilIi<"IliIlllilIi","a4W8Lf4Hom7jsTicartW4uPech97kLVJvYsFdNBCObzrUvJKiRE=">(),
               IliIlllilIi<"IliIlllilIi","VniGoYTVjJ6smCZP1tnUZOMiqjd629qQ+Zv4hlppg+5tu0Dnc3fjHavQ9FNjViTg0w==">()
                  + var3
                  + IliIlllilIi<"IliIlllilIi","ftQymS11XoHI6NQgibkHYjY1zP9pGPOcVYR3EdF4ziY=">()
            )
         );
      }

      liIllIiiiiIllIii = new HashMap<>();
      IIlllIiilIlllIii = -1;
   }

   @Override
   public void ilIllIiIll() {
      this.IilllIiililllIii.IilliliilIIi();
   }

   @Override
   public void iiiIlIIIll(class_332 ctx, int w, int x, int y, int h) {
      this.IilllIiililllIii.IliIlllilIi(ctx, w, x, y, h, this.iIlllIiiIllllIii);
   }

   public int Iillllilll() {
      return this.iIlllIiiIllllIii;
   }

   @Override
   public void IlIllllIll(double mx, double my) {
      this.IilllIiililllIii.iIlIlllllill(mx, my);
   }

   public class_8685 lllllillll() {
      return this.iIlllIllll(this.iIlllIiiIllllIii);
   }

   public static class_8685 iilllIIill(class_742 player) {
      if (class_310.method_1551().field_1724 != player) {
         return null;
      } else if (llilIllililIll.iliIiiliiiii(iiIiilIIliil.class) instanceof iiIiilIIliil var2) {
         if (IIlllIiilIlllIii >= 0) {
            return var2.iIlllIllll(IIlllIiilIlllIii);
         } else {
            return !var2.IliIlllilIi() ? null : var2.lllllillll();
         }
      } else {
         return null;
      }
   }

   private static int IIllllIlll() {
      return ilIllIiiIiIllIii.isEmpty() ? 0 : ThreadLocalRandom.current().nextInt(ilIllIiiIiIllIii.size());
   }

   @Override
   protected void Illillliilli() {
      this.iIlllIiiIllllIii = IIllllIlll();
   }

   public iiIiilIIliil() {
      super(IliIlllilIi<"IliIlllilIi","/8qgMTKQQ6RLhOiXQk0oHWtZks61+uH+m2X8HMLdYGCvgFTToyDi">(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.lllllIiiillllIii = new ililliIiIiilliIi(
         IliIlllilIi<"IliIlllilIi","t8PcPe0fUmHmS5fsVlpbGYL0JB7aq1GBEndpgcH7h51tbKisuA2ojQ==">(),
         IliIlllilIi<"IliIlllilIi","AwHT8YynmJUhuTdoKuJzs7v/TqblnumrBH+uEkl2e2mSTMl+OaIst4zP5D7bUh3rxfGjx1r8zQNp">(),
         IliIlllilIi<"IliIlllilIi","HAQ11O6x8zk+12hdQ3lGUyA1w0m0b+TmLF6AnJaGAJN2L1Y=">(),
         this::liIlliiIll
      );
      this.IilllIiililllIii = new iIllIIilIlllIIil();
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.lllllIiiillllIii});
   }

   @Override
   public boolean lIIlliIIll(double w, double x, int button, int y, int h, int mx, int my) {
      return this.IilllIiililllIii.liiiIIllIl(w, x, button, y, h, mx, my);
   }
}
