package gg.corz;

import java.util.HashSet;
import java.util.Set;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1684;
import net.minecraft.class_1802;
import net.minecraft.class_243;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_239.class_240;
import net.minecraft.class_2828.class_2831;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;

public class liiIlliiiiIlli extends ilIllIiIll {
   private final IIIIlilllIIIlill lIllilIIIl = new IIIIlilllIIIlill(
      IliIlllilIi<"IliIlllilIi","H7CY3IaVHHYlvy9CtLlWqMmmCAzez9neoPCHXK18LtlVyOsGyFrlJto/Efc=">(),
      IliIlllilIi<"IliIlllilIi","87+xNy6U8uRs6Ly+Vkz1Em+IvpsjQMWO7G4q0suFSL9+hy7lWJJT0cbj0er+9Mr5cxV9I3E1jXTvCbrb+cIaP7gczmWjAG0OWQ==">(),
      60.0,
      10.0,
      120.0,
      5.0
   );
   private final IIIIlilllIIIlill illlilIIIl;
   private final Set<Integer> lillilIIIl;
   private final IllIIiIllllIIiIl IillilIIIl;
   private final iilliIlIIiliIl iIllilIIIl = new iilliIlIIiliIl(
      IliIlllilIi<"IliIlllilIi","LJvqxTe/iCLsTjUq2g/fKE8S/v43CUqJVHdJnlfWghHm">(),
      IliIlllilIi<"IliIlllilIi","GDjp1BuvC3/30d3Vsz2JqsNO21Pv2Q6lLi3AQaGWgLJSUVCk7/sOzLsmkzSU5uDLKXfFltj9n/PDSuh3U7PZ">(),
      500,
      100,
      3000
   );
   private final iiIiiilIIliiil llllilIIIl;
   private final iiIiiilIIliiil IlllilIIIl = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","mpK54mAer+Cg2K2ilC6QPOLbBR2RYhv3L75qy167jYcCuh7QIHIA">(),
      IliIlllilIi<"IliIlllilIi","3/7LPZBysXxU4uLKPWmSREAbBSh8eTGDIj2fxmeFVOoj02b1YpFhag8RS0X/cqPKgGVnAaOR6Vg0RP7MwVF9HAKyqPgUQ+6yCuz3KZmipeCpT+r1Yz0YSBnsR9qk7o0cAwPxr8jaYsU16XU=">(),
      true
   );

   private void ilIllIiIll(float yaw, float pitch) {
      float var3 = Iiiilllliiilll.field_1724.method_36454();
      float var4 = Iiiilllliiilll.field_1724.method_36455();
      Iiiilllliiilll.field_1724.method_36456(yaw);
      Iiiilllliiilll.field_1724.method_36457(pitch);
      Iiiilllliiilll.field_1724
         .field_3944
         .method_52787(new class_2831(yaw, pitch, Iiiilllliiilll.field_1724.method_24828(), Iiiilllliiilll.field_1724.field_5976));
      Iiiilllliiilll.field_1761.method_2919(Iiiilllliiilll.field_1724, class_1268.field_5808);
      Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
      Iiiilllliiilll.field_1724.method_36456(var3);
      Iiiilllliiilll.field_1724.method_36457(var4);
   }

   @Override
   public void Illillliilli() {
      this.lillilIIIl.clear();
   }

   private boolean lIIlliIIll(class_243 to, class_243 from) {
      class_3965 var3 = Iiiilllliiilll.field_1687
         .method_17742(new class_3959(to, from, class_3960.field_17558, class_242.field_1348, Iiiilllliiilll.field_1724));
      return var3.method_17783() != class_240.field_1332
         || var3.method_17784().method_1022(from) <= Double.longBitsToDouble(-106632009956492472L ^ -4718318028383880376L);
   }

   @Override
   public void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1761 != null && Iiiilllliiilll.field_1687 != null) {
         if (Iiiilllliiilll.field_1755 == null) {
            this.lillilIIIl.removeIf(id -> Iiiilllliiilll.field_1687.method_8469(id) == null);
            if (this.IillilIIIl.iIlIlllllill((long)this.iIllilIIIl.Iilllilliill())) {
               class_1684 var1 = this.IlIllllIll();
               if (var1 != null) {
                  lIililiIilil var2 = liIiililiiIiilil.liiiIIllIl(var1.method_73189(), var1.method_18798(), 300);
                  class_243 var3 = var2.IIIlIIiilIIlIIii;
                  class_243 var4 = Iiiilllliiilll.field_1724.method_33571();
                  if (var4.method_1022(var3) > this.lIllilIIIl.Iilllilliill()) {
                     this.lillilIIIl.add(var1.method_5628());
                  } else {
                     int var5 = IilIIililIIi.lIiiIiIlilli(class_1802.field_8634);
                     if (var5 != -1) {
                        float var6 = liIiililiiIiilil.IiIlliIliiIl(var4, var3, 1.5, 0.03);
                        if (Float.isNaN(var6)) {
                           this.lillilIIIl.add(var1.method_5628());
                        } else {
                           float var7 = ilIiiIiIii.Ililllililil(var4, var3)[0];
                           if (this.IlllilIIIl.Iilllilliill()) {
                              lIililiIilil var8 = liIiililiiIiilil.liiiIIllIl(var4, this.iiiIlIIIll(var7, var6), 300);
                              double var9 = var8.IIIlIIiilIIlIIii.method_1022(var3);
                              if (var8.iIIlIIiiIlIlIIii && var9 > this.illlilIIIl.Iilllilliill()) {
                                 return;
                              }
                           }

                           if (!this.llllilIIIl.Iilllilliill() || this.lIIlliIIll(var4, var3)) {
                              int var11 = Iiiilllliiilll.field_1724.method_31548().method_67532();
                              Iiiilllliiilll.field_1724.method_31548().method_61496(var5);
                              this.ilIllIiIll(var7, var6);
                              Iiiilllliiilll.field_1724.method_31548().method_61496(var11);
                              this.lillilIIIl.add(var1.method_5628());
                              this.IillilIIIl.IliIlllilIi();
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private class_1684 IlIllllIll() {
      for (class_1297 var2 : Iiiilllliiilll.field_1687.method_18112()) {
         if (var2 instanceof class_1684) {
            class_1684 var3 = (class_1684)var2;
            if (!this.lillilIIIl.contains(var3.method_5628())) {
               class_1297 var4 = var3.method_24921();
               if (var4 instanceof class_1657 && var4 != Iiiilllliiilll.field_1724 && !iIIiIiIlIlIiIiIl.liiiIIllIl(var4)) {
                  return var3;
               }
            }
         }
      }

      return null;
   }

   public liiIlliiiiIlli() {
      super(IliIlllilIi<"IliIlllilIi","efhpwlyxQOkMq8BioI8hcmFI4v8Vy16k/k7mfJUffC7BOXrFHIRCVs9gWLo=">(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.llllilIIIl = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","xUYHU1a719wYzDte+mda5wbIs3EnIgtW7jL0Uq3Rn/bgJia7ujiBOFg=">(),
         IliIlllilIi<"IliIlllilIi","7+f5vdSobqg1lNhS44kMLBimN1TsnhcKjBvIPsfjv9UrvNh/j1Eztsbc7wHH5gXdAAcLH/r/BFv8omCvKH/2TF6dTA+gozFZv8A=">(),
         false
      );
      this.illlilIIIl = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","8CTa//ovDc57hn+KxAeFg1bRrMesbgHG7pqQYsZhcdQSflsgoyO8YsJxVi5kWdwtAQip">(),
         IliIlllilIi<"IliIlllilIi","+7TojUiRzQLE4C+2k9X1/wcXIIgZM2y61gkRMdD8PL+At7MIJbdsLxK93yfpIsCwxYwA/iqq5Ecsf+IcLhyqafXa3xZ0gAWh36pDfR0+NxnyTpMTTys2hl+7IzAy324FwxyNv3jbKjIxGX5f6wpUBl+rz/RbCkt/">(),
         3.0,
         0.5,
         12.0,
         0.5
      );
      this.IillilIIIl = new IllIIiIllllIIiIl();
      this.lillilIIIl = new HashSet<>();
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.lIllilIIIl, this.iIllilIIIl, this.IlllilIIIl, this.llllilIIIl, this.illlilIIIl});
   }

   private class_243 iiiIlIIIll(float yaw, float pitch) {
      double var3 = Math.toRadians((double)yaw);
      double var5 = Math.toRadians((double)pitch);
      class_243 var7 = new class_243(-Math.sin(var3) * Math.cos(var5), -Math.sin(var5), Math.cos(var3) * Math.cos(var5)).method_1029();
      return var7.method_1021(Double.longBitsToDouble(1807395011368621645L ^ 2804942328831186509L)).method_1019(Iiiilllliiilll.field_1724.method_18798());
   }
}
