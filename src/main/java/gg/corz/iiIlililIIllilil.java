package gg.corz;

import java.util.HashSet;
import java.util.Set;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1684;

public class iiIlililIIllilil extends ilIllIiIll {
   private final Set<Integer> liliIlIlil;
   private final IIIIlilllIIIlill IiliIlIlil = new IIIIlilllIIIlill(
      IliIlllilIi<"IliIlllilIi","wQpP6fx7ZIWLEt2OqV5I5IvX0y0pOngoNOP8Hd6k3R9/iw==">(),
      IliIlllilIi<"IliIlllilIi","8ciaRW3shjkdZlBTXmtOquN4P5dKXc/s4GXGUdGvvSgFV5+OHcoILitjJvFWqGe+aVuGb+V21z+u1o+Arzw6ct5Nq/pcOcEuRE6U">(),
      Double.longBitsToDouble(-7806796284439175761L ^ -3189480766477574737L),
      1.0,
      Double.longBitsToDouble(4987126101055970235L ^ 363618133606734779L),
      Double.longBitsToDouble(5937528103205800020L ^ 7892090341484595284L)
   );

   @Override
   public void Illillliilli() {
      this.liliIlIlil.clear();
   }

   public iiIlililIIllilil() {
      super(IliIlllilIi<"IliIlllilIi","6L/peRoJBwHKyYJZM6INRV6H2gvJ4dxeyTKGw9VejdqA1jrL9fTI">(), lllIllillIll.llIlIIIiilIlIIIi);
      this.liliIlIlil = new HashSet<>();
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IiliIlIlil});
   }

   @Override
   public void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         this.liliIlIlil.removeIf(id -> Iiiilllliiilll.field_1687.method_8469(id) == null);

         for (class_1297 var2 : Iiiilllliiilll.field_1687.method_18112()) {
            if (var2 instanceof class_1684) {
               class_1684 var3 = (class_1684)var2;
               if (!this.liliIlIlil.contains(var3.method_5628())) {
                  class_1297 var4 = var3.method_24921();
                  if (var4 instanceof class_1657 && var4 != Iiiilllliiilll.field_1724) {
                     lIililiIilil var5 = liIiililiiIiilil.liiiIIllIl(var3.method_73189(), var3.method_18798(), 300);
                     double var6 = Iiiilllliiilll.field_1724.method_73189().method_1022(var5.IIIlIIiilIIlIIii);
                     if (var6 <= this.IiliIlIlil.Iilllilliill()) {
                        Iliiiiilliiiii.IliIlllilIi()
                           .iIlIlllllill(
                              IliIlllilIi<"IliIlllilIi","0ETrutooGvDIe3kIRllMG/KTyeSv02yag4mjPfAzq1G3re8I1x8styeKKg==">(),
                              String.format(IliIlllilIi<"IliIlllilIi","YgwhVzDeWGo7quYsS0jQkydoKTf6lMQbirEet3ea1wCqo0KsG5Xy13tlVzAM16Q=">(), var6),
                              true
                           );
                        this.liliIlIlil.add(var3.method_5628());
                     }
                  }
               }
            }
         }
      }
   }
}
