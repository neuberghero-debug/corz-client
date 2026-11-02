package gg.corz;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_2338;

public record IiIiiIlliIiiIl(
   illllIliIilllIli verdict,
   class_2338 feet,
   int cells,
   List<class_2338> pocket,
   List<class_2338> escapes,
   List<ililiIIlIiiliIIl> walls,
   ililiIIlIiiliIIl roof,
   ililiIIlIiiliIIl los
) {
   public static final IiIiiIlliIiiIl lIiIiiilliIiIiiill = new IiIiiIlliIiiIl(illllIliIilllIli.IililIllIi, null, 0, List.of(), List.of(), List.of(), null, null);
   private final List<class_2338> IIlIiiilllIlIiiill;
   private final class_2338 ilIIiiillIiIIiiill;
   private final illllIliIilllIli IlIIiiillllIIiiill;
   private final ililiIIlIiiliIIl IilIiiilllilIiiill;
   private final List<class_2338> iIlIiiillIllIiiill;
   private final List<ililiIIlIiiliIIl> lllIiiillillIiiill;
   private final int liIIiiilliiIIiiill;
   private final ililiIIlIiiliIIl iilIiiillIIiIiiill;

   public List<class_2338> IIlllIlliIll() {
      return this.iIlIiiillIllIiiill;
   }

   public List<ililiIIlIiiliIIl> Illlllllilll() {
      return this.lllIiiillillIiiill;
   }

   public List<class_2338> IiIlliIliiIl() {
      return this.IIlIiiilllIlIiiill;
   }

   public ililiIIlIiiliIIl IIillIiliIil() {
      return this.iilIiiillIIiIiiill;
   }

   public class_2338 IIIllIIliIIl() {
      return this.ilIIiiillIiIIiiill;
   }

   public ililiIIlIiiliIIl IilliliilIIi(class_2338 p) {
      if (p == null) {
         return null;
      } else {
         for (ililiIIlIiiliIIl var3 : this.lllIiiillillIiiill) {
            if (var3.liiiIIllIl().equals(p)) {
               return var3;
            }
         }

         if (this.IilIiiilllilIiiill != null && this.IilIiiilllilIiiill.liiiIIllIl().equals(p)) {
            return this.IilIiiilllilIiiill;
         } else {
            return this.iilIiiillIIiIiiill != null && this.iilIiiillIIiIiiill.liiiIIllIl().equals(p) ? this.iilIiiillIIiIiiill : null;
         }
      }
   }

   public List<ililiIIlIiiliIIl> iIlIlllllill(int level) {
      ArrayList var2 = new ArrayList();

      for (ililiIIlIiiliIIl var4 : this.lllIiiillillIiiill) {
         if (var4.iIlIlllllill() == level) {
            var2.add(var4);
         }
      }

      return var2;
   }

   public boolean lIiiIiIlilli(class_2338 within, int p) {
      if (within != null && this.ilIIiiillIiIIiiill != null) {
         for (class_2338 var4 : this.IIlIiiilllIlIiiill) {
            if (IlIIlIIlllIIlIIl.IliIlllilIi(var4, within) <= p) {
               return true;
            }
         }

         return IlIIlIIlllIIlIIl.IliIlllilIi(this.ilIIiiillIiIIiiill, within) <= p + 1;
      } else {
         return false;
      }
   }

   public int IlIlllIlilIl() {
      return this.liIIiiilliiIIiiill;
   }

   public boolean liiiIIllIl() {
      return this.IlIIiiillllIIiiill == illllIliIilllIli.lIiilIllIi;
   }

   public boolean IliIlllilIi() {
      return this.IlIIiiillllIIiiill != illllIliIilllIli.IililIllIi;
   }

   public illllIliIilllIli iliIiiliiiii() {
      return this.IlIIiiillllIIiiill;
   }

   public ililiIIlIiiliIIl Iilllilliill() {
      return this.IilIiiilllilIiiill;
   }

   public IiIiiIlliIiiIl(
      illllIliIilllIli verdict,
      class_2338 feet,
      int cells,
      List<class_2338> pocket,
      List<class_2338> escapes,
      List<ililiIIlIiiliIIl> walls,
      ililiIIlIiiliIIl roof,
      ililiIIlIiiliIIl los
   ) {
      this.IlIIiiillllIIiiill = verdict;
      this.ilIIiiillIiIIiiill = feet;
      this.liIIiiilliiIIiiill = cells;
      this.IIlIiiilllIlIiiill = pocket;
      this.iIlIiiillIllIiiill = escapes;
      this.lllIiiillillIiiill = walls;
      this.IilIiiilllilIiiill = roof;
      this.iilIiiillIIiIiiill = los;
   }
}
