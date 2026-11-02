package gg.corz;

import java.util.List;
import net.minecraft.class_2338;

public record iiliilIlIIiiilIl(class_2338 feet, IllIllllllIlll move, List<class_2338> mine, boolean wet, boolean submerged) {
   private final IllIllllllIlll lliIIIiIll;
   private final class_2338 IliIIIiIll;
   private final boolean liiIIIiIll;
   private final boolean IiiIIIiIll;
   private final List<class_2338> iliIIIiIll;

   public boolean IilliliilIIi() {
      return this.IiiIIIiIll;
   }

   public class_2338 IliIlllilIi() {
      return this.IliIIIiIll;
   }

   public iiliilIlIIiiilIl(class_2338 feet, IllIllllllIlll move, List<class_2338> mine, boolean wet, boolean submerged) {
      this.IliIIIiIll = feet;
      this.lliIIIiIll = move;
      this.iliIIIiIll = mine;
      this.IiiIIIiIll = wet;
      this.liiIIIiIll = submerged;
   }

   public IllIllllllIlll liiiIIllIl() {
      return this.lliIIIiIll;
   }

   public boolean lIiiIiIlilli() {
      return this.liiIIIiIll;
   }

   public List<class_2338> iIlIlllllill() {
      return this.iliIIIiIll;
   }
}
