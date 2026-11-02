package gg.corz;

import java.util.List;

public record IiilIIllliilIIll(iiiillIlIIIIilIl decision, IliiIlIllliiIlIl roi, IIiIlIilIiIlIi alternative, List<llIllliilIllli> phantoms, String reason) {
   private final List<llIllliilIllli> IiiIlIllll;
   private final IliiIlIllliiIlIl lliIlIllll;
   private final String liiIlIllll;
   private final iiiillIlIIIIilIl IliIlIllll;
   private final IIiIlIilIiIlIi iliIlIllll;

   public IliiIlIllliiIlIl lIiiIiIlilli() {
      return this.lliIlIllll;
   }

   public String IlIlllIlilIl() {
      return this.liiIlIllll;
   }

   public String iIlIlllllill() {
      return IiIlliIliiIl<"IiIlliIliiIl","wiBYoKxHalj1Vj8Y3VGc8nKnTRdr5ZmaeoGeUfExMrjJCL/b9g==">()
         + this.IliIlIllll
         + IiIlliIliiIl<"IiIlliIliiIl","hWhSfTQxNA/blePrnrEM7FqzLhx5/08JuutP9Fh4yuH6">()
         + (this.lliIlIllll == null ? IiIlliIliiIl<"IiIlliIliiIl","dcYM491/kAV7BjGFyQ5fGFyEPdc4aJforIrRyuBlJhI=">() : this.lliIlIllll.IliIlllilIi())
         + IiIlliIliiIl<"IiIlliIliiIl","x2dlqXxThVVxFLeXOeVNAD9AKY+QEEi4gLG9k9t3T+wf/7WUoJW+on/z1FLi">()
         + this.IiiIlIllll.size()
         + (
            this.iliIlIllll == null
               ? ""
               : IiIlliIliiIl<"IiIlliIliiIl","SMYfWdcEo8iebmdJv1NkW3ZrOKqJBcvQAkT0a2gfp7h/kNTo1nZMAbk=">() + this.iliIlIllll.IilliliilIIi()
         )
         + IiIlliIliiIl<"IiIlliIliiIl","+OfwkNvGrq3Gjn6VKGZ/ZcuDMLzUjvPFwOO0P4Qz/wPHfV9C">()
         + this.liiIlIllll;
   }

   public boolean IliIlllilIi() {
      return this.IliIlIllll == iiiillIlIIIIilIl.iiilIlliIl;
   }

   public IiilIIllliilIIll(iiiillIlIIIIilIl decision, IliiIlIllliiIlIl roi, IIiIlIilIiIlIi alternative, List<llIllliilIllli> phantoms, String reason) {
      this.IliIlIllll = decision;
      this.lliIlIllll = roi;
      this.iliIlIllll = alternative;
      this.IiiIlIllll = phantoms;
      this.liiIlIllll = reason;
   }

   public iiiillIlIIIIilIl IilliliilIIi() {
      return this.IliIlIllll;
   }

   public IIiIlIilIiIlIi iliIiiliiiii() {
      return this.iliIlIllll;
   }

   public int liiiIIllIl() {
      return this.IiiIlIllll.size();
   }

   public List<llIllliilIllli> IIIllIIliIIl() {
      return this.IiiIlIllll;
   }
}
